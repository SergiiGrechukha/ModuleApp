package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1280 {

    @Ignore    private SampleClass1281 sampleClass;

    public SampleClass1280(){
        sampleClass = new SampleClass1281();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}