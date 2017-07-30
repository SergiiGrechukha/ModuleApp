package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1359 {

    @Ignore    private SampleClass1360 sampleClass;

    public SampleClass1359(){
        sampleClass = new SampleClass1360();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}