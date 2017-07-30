package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1272 {

    @Ignore    private SampleClass1273 sampleClass;

    public SampleClass1272(){
        sampleClass = new SampleClass1273();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}