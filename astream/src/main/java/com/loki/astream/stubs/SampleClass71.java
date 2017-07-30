package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass71 {

    @Ignore    private SampleClass72 sampleClass;

    public SampleClass71(){
        sampleClass = new SampleClass72();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}