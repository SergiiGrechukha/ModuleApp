package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1233 {

    @Ignore    private SampleClass1234 sampleClass;

    public SampleClass1233(){
        sampleClass = new SampleClass1234();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}