package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1481 {

    @Ignore    private SampleClass1482 sampleClass;

    public SampleClass1481(){
        sampleClass = new SampleClass1482();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}