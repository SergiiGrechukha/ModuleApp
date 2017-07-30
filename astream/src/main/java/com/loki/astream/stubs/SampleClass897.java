package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass897 {

    @Ignore    private SampleClass898 sampleClass;

    public SampleClass897(){
        sampleClass = new SampleClass898();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}