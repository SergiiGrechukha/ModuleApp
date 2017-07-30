package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass591 {

    @Ignore    private SampleClass592 sampleClass;

    public SampleClass591(){
        sampleClass = new SampleClass592();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}