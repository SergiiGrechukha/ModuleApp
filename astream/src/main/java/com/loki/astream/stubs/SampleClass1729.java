package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1729 {

    @Ignore    private SampleClass1730 sampleClass;

    public SampleClass1729(){
        sampleClass = new SampleClass1730();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}