package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass871 {

    @Ignore    private SampleClass872 sampleClass;

    public SampleClass871(){
        sampleClass = new SampleClass872();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}