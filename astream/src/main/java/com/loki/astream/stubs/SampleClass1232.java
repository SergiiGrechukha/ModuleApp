package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1232 {

    @Ignore    private SampleClass1233 sampleClass;

    public SampleClass1232(){
        sampleClass = new SampleClass1233();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}