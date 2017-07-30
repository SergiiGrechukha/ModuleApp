package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass968 {

    @Ignore    private SampleClass969 sampleClass;

    public SampleClass968(){
        sampleClass = new SampleClass969();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}