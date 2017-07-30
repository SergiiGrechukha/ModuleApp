package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1612 {

    @Ignore    private SampleClass1613 sampleClass;

    public SampleClass1612(){
        sampleClass = new SampleClass1613();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}