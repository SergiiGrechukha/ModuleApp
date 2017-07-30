package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass311 {

    @Ignore    private SampleClass312 sampleClass;

    public SampleClass311(){
        sampleClass = new SampleClass312();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}