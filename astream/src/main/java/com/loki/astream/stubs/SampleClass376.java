package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass376 {

    @Ignore    private SampleClass377 sampleClass;

    public SampleClass376(){
        sampleClass = new SampleClass377();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}