package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1550 {

    @Ignore    private SampleClass1551 sampleClass;

    public SampleClass1550(){
        sampleClass = new SampleClass1551();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}