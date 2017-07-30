package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1080 {

    @Ignore    private SampleClass1081 sampleClass;

    public SampleClass1080(){
        sampleClass = new SampleClass1081();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}