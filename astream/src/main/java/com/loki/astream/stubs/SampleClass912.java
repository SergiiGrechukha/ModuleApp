package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass912 {

    @Ignore    private SampleClass913 sampleClass;

    public SampleClass912(){
        sampleClass = new SampleClass913();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}