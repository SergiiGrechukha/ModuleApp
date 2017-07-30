package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass375 {

    @Ignore    private SampleClass376 sampleClass;

    public SampleClass375(){
        sampleClass = new SampleClass376();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}