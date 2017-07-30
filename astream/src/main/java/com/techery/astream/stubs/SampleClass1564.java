package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1564 {

    @Ignore    private SampleClass1565 sampleClass;

    public SampleClass1564(){
        sampleClass = new SampleClass1565();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}