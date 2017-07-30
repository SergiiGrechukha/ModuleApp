package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1436 {

    @Ignore    private SampleClass1437 sampleClass;

    public SampleClass1436(){
        sampleClass = new SampleClass1437();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}