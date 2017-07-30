package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass54 {

    @Ignore    private SampleClass55 sampleClass;

    public SampleClass54(){
        sampleClass = new SampleClass55();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}