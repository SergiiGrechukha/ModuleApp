package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1076 {

    @Ignore    private SampleClass1077 sampleClass;

    public SampleClass1076(){
        sampleClass = new SampleClass1077();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}