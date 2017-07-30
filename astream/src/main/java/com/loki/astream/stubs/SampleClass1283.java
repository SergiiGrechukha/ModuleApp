package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1283 {

    @Ignore    private SampleClass1284 sampleClass;

    public SampleClass1283(){
        sampleClass = new SampleClass1284();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}