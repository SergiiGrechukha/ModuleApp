package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1077 {

    @Ignore    private SampleClass1078 sampleClass;

    public SampleClass1077(){
        sampleClass = new SampleClass1078();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}