package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass34 {

    @Ignore    private SampleClass35 sampleClass;

    public SampleClass34(){
        sampleClass = new SampleClass35();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}