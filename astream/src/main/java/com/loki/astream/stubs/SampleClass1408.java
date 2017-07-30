package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1408 {

    @Ignore    private SampleClass1409 sampleClass;

    public SampleClass1408(){
        sampleClass = new SampleClass1409();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}