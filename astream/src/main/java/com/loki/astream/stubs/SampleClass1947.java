package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1947 {

    @Ignore    private SampleClass1948 sampleClass;

    public SampleClass1947(){
        sampleClass = new SampleClass1948();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}