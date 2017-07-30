package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1238 {

    @Ignore    private SampleClass1239 sampleClass;

    public SampleClass1238(){
        sampleClass = new SampleClass1239();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}