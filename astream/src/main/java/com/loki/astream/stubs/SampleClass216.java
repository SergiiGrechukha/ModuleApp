package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass216 {

    @Ignore    private SampleClass217 sampleClass;

    public SampleClass216(){
        sampleClass = new SampleClass217();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}