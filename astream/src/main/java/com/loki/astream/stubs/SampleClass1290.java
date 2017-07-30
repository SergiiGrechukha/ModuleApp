package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1290 {

    @Ignore    private SampleClass1291 sampleClass;

    public SampleClass1290(){
        sampleClass = new SampleClass1291();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}