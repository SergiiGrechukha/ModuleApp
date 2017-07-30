package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1566 {

    @Ignore    private SampleClass1567 sampleClass;

    public SampleClass1566(){
        sampleClass = new SampleClass1567();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}