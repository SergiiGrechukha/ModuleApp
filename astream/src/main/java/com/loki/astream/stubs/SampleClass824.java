package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass824 {

    @Ignore    private SampleClass825 sampleClass;

    public SampleClass824(){
        sampleClass = new SampleClass825();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}