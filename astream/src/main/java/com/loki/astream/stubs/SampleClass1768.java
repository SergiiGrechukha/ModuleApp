package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1768 {

    @Ignore    private SampleClass1769 sampleClass;

    public SampleClass1768(){
        sampleClass = new SampleClass1769();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}