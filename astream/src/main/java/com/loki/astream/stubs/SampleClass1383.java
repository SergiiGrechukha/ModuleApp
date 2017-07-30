package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1383 {

    @Ignore    private SampleClass1384 sampleClass;

    public SampleClass1383(){
        sampleClass = new SampleClass1384();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}