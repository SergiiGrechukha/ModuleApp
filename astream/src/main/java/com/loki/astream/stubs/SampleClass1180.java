package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1180 {

    @Ignore    private SampleClass1181 sampleClass;

    public SampleClass1180(){
        sampleClass = new SampleClass1181();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}