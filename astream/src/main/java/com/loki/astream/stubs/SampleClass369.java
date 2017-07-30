package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass369 {

    @Ignore    private SampleClass370 sampleClass;

    public SampleClass369(){
        sampleClass = new SampleClass370();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}