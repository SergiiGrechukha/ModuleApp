package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass593 {

    @Ignore    private SampleClass594 sampleClass;

    public SampleClass593(){
        sampleClass = new SampleClass594();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}