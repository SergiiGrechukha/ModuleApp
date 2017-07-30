package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1835 {

    @Ignore    private SampleClass1836 sampleClass;

    public SampleClass1835(){
        sampleClass = new SampleClass1836();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}