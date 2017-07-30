package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass882 {

    @Ignore    private SampleClass883 sampleClass;

    public SampleClass882(){
        sampleClass = new SampleClass883();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}