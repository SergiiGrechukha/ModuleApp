package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass401 {

    @Ignore    private SampleClass402 sampleClass;

    public SampleClass401(){
        sampleClass = new SampleClass402();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}