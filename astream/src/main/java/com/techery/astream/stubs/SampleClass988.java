package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass988 {

    @Ignore    private SampleClass989 sampleClass;

    public SampleClass988(){
        sampleClass = new SampleClass989();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}