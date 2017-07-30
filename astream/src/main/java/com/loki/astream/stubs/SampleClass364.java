package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass364 {

    @Ignore    private SampleClass365 sampleClass;

    public SampleClass364(){
        sampleClass = new SampleClass365();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}