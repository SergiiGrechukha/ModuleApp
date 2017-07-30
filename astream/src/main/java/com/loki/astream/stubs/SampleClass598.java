package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass598 {

    @Ignore    private SampleClass599 sampleClass;

    public SampleClass598(){
        sampleClass = new SampleClass599();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}