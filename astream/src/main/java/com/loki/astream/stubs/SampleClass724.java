package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass724 {

    @Ignore    private SampleClass725 sampleClass;

    public SampleClass724(){
        sampleClass = new SampleClass725();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}