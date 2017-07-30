package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1010 {

    @Ignore    private SampleClass1011 sampleClass;

    public SampleClass1010(){
        sampleClass = new SampleClass1011();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}