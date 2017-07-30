package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1401 {

    @Ignore    private SampleClass1402 sampleClass;

    public SampleClass1401(){
        sampleClass = new SampleClass1402();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}