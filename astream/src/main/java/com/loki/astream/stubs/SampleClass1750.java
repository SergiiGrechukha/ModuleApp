package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1750 {

    @Ignore    private SampleClass1751 sampleClass;

    public SampleClass1750(){
        sampleClass = new SampleClass1751();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}