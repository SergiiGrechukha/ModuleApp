package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass494 {

    @Ignore    private SampleClass495 sampleClass;

    public SampleClass494(){
        sampleClass = new SampleClass495();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}