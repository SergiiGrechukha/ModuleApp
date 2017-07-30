package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass217 {

    @Ignore    private SampleClass218 sampleClass;

    public SampleClass217(){
        sampleClass = new SampleClass218();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}