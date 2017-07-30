package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1045 {

    @Ignore    private SampleClass1046 sampleClass;

    public SampleClass1045(){
        sampleClass = new SampleClass1046();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}