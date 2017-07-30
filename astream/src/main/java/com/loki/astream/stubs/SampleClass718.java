package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass718 {

    @Ignore    private SampleClass719 sampleClass;

    public SampleClass718(){
        sampleClass = new SampleClass719();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}