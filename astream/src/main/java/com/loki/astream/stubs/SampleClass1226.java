package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1226 {

    @Ignore    private SampleClass1227 sampleClass;

    public SampleClass1226(){
        sampleClass = new SampleClass1227();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}