package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1311 {

    @Ignore    private SampleClass1312 sampleClass;

    public SampleClass1311(){
        sampleClass = new SampleClass1312();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}