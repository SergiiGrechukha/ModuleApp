package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass963 {

    @Ignore    private SampleClass964 sampleClass;

    public SampleClass963(){
        sampleClass = new SampleClass964();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}