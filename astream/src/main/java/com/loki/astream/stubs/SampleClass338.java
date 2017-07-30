package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass338 {

    @Ignore    private SampleClass339 sampleClass;

    public SampleClass338(){
        sampleClass = new SampleClass339();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}