package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1880 {

    @Ignore    private SampleClass1881 sampleClass;

    public SampleClass1880(){
        sampleClass = new SampleClass1881();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}