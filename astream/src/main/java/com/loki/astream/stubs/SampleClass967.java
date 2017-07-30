package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass967 {

    @Ignore    private SampleClass968 sampleClass;

    public SampleClass967(){
        sampleClass = new SampleClass968();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}