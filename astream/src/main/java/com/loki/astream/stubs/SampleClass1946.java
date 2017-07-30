package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1946 {

    @Ignore    private SampleClass1947 sampleClass;

    public SampleClass1946(){
        sampleClass = new SampleClass1947();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}