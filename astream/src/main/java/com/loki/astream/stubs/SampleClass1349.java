package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1349 {

    @Ignore    private SampleClass1350 sampleClass;

    public SampleClass1349(){
        sampleClass = new SampleClass1350();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}