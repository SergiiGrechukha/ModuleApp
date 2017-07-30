package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1279 {

    @Ignore    private SampleClass1280 sampleClass;

    public SampleClass1279(){
        sampleClass = new SampleClass1280();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}