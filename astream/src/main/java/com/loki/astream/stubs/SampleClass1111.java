package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1111 {

    @Ignore    private SampleClass1112 sampleClass;

    public SampleClass1111(){
        sampleClass = new SampleClass1112();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}