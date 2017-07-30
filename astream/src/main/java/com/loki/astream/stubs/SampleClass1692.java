package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1692 {

    @Ignore    private SampleClass1693 sampleClass;

    public SampleClass1692(){
        sampleClass = new SampleClass1693();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}