package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1037 {

    @Ignore    private SampleClass1038 sampleClass;

    public SampleClass1037(){
        sampleClass = new SampleClass1038();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}