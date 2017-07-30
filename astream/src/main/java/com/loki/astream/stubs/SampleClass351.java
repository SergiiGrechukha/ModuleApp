package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass351 {

    @Ignore    private SampleClass352 sampleClass;

    public SampleClass351(){
        sampleClass = new SampleClass352();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}