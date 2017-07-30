package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass201 {

    @Ignore    private SampleClass202 sampleClass;

    public SampleClass201(){
        sampleClass = new SampleClass202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}