package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1140 {

    @Ignore    private SampleClass1141 sampleClass;

    public SampleClass1140(){
        sampleClass = new SampleClass1141();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}