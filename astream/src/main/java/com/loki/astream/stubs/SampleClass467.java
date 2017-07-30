package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass467 {

    @Ignore    private SampleClass468 sampleClass;

    public SampleClass467(){
        sampleClass = new SampleClass468();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}