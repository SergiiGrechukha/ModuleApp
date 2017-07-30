package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1019 {

    @Ignore    private SampleClass1020 sampleClass;

    public SampleClass1019(){
        sampleClass = new SampleClass1020();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}