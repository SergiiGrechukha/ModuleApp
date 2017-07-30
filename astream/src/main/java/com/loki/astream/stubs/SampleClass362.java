package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass362 {

    @Ignore    private SampleClass363 sampleClass;

    public SampleClass362(){
        sampleClass = new SampleClass363();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}