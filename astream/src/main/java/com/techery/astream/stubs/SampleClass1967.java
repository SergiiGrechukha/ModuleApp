package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1967 {

    @Ignore    private SampleClass1968 sampleClass;

    public SampleClass1967(){
        sampleClass = new SampleClass1968();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}