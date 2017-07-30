package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1271 {

    @Ignore    private SampleClass1272 sampleClass;

    public SampleClass1271(){
        sampleClass = new SampleClass1272();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}