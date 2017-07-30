package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass279 {

    @Ignore    private SampleClass280 sampleClass;

    public SampleClass279(){
        sampleClass = new SampleClass280();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}