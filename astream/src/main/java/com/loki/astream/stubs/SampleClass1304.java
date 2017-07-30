package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1304 {

    @Ignore    private SampleClass1305 sampleClass;

    public SampleClass1304(){
        sampleClass = new SampleClass1305();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}