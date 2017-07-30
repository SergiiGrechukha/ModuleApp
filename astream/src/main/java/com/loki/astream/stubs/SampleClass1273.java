package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1273 {

    @Ignore    private SampleClass1274 sampleClass;

    public SampleClass1273(){
        sampleClass = new SampleClass1274();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}