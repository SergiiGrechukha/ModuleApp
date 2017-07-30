package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1826 {

    @Ignore    private SampleClass1827 sampleClass;

    public SampleClass1826(){
        sampleClass = new SampleClass1827();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}