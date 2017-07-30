package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass773 {

    @Ignore    private SampleClass774 sampleClass;

    public SampleClass773(){
        sampleClass = new SampleClass774();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}