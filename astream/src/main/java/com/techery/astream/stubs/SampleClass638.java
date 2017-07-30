package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass638 {

    @Ignore    private SampleClass639 sampleClass;

    public SampleClass638(){
        sampleClass = new SampleClass639();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}