package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1407 {

    @Ignore    private SampleClass1408 sampleClass;

    public SampleClass1407(){
        sampleClass = new SampleClass1408();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}