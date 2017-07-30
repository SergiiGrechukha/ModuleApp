package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1460 {

    @Ignore    private SampleClass1461 sampleClass;

    public SampleClass1460(){
        sampleClass = new SampleClass1461();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}