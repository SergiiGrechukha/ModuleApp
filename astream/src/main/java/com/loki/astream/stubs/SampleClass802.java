package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass802 {

    @Ignore    private SampleClass803 sampleClass;

    public SampleClass802(){
        sampleClass = new SampleClass803();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}