package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1622 {

    @Ignore    private SampleClass1623 sampleClass;

    public SampleClass1622(){
        sampleClass = new SampleClass1623();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}