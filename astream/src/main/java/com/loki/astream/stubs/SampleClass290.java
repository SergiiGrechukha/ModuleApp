package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass290 {

    @Ignore    private SampleClass291 sampleClass;

    public SampleClass290(){
        sampleClass = new SampleClass291();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}