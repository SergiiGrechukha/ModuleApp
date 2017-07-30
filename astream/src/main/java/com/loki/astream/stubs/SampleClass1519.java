package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1519 {

    @Ignore    private SampleClass1520 sampleClass;

    public SampleClass1519(){
        sampleClass = new SampleClass1520();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}