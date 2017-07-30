package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1749 {

    @Ignore    private SampleClass1750 sampleClass;

    public SampleClass1749(){
        sampleClass = new SampleClass1750();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}