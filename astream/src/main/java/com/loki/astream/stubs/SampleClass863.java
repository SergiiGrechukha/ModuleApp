package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass863 {

    @Ignore    private SampleClass864 sampleClass;

    public SampleClass863(){
        sampleClass = new SampleClass864();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}