package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass457 {

    @Ignore    private SampleClass458 sampleClass;

    public SampleClass457(){
        sampleClass = new SampleClass458();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}