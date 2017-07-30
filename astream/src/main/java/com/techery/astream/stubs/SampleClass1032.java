package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1032 {

    @Ignore    private SampleClass1033 sampleClass;

    public SampleClass1032(){
        sampleClass = new SampleClass1033();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}