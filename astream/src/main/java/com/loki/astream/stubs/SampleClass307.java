package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass307 {

    @Ignore    private SampleClass308 sampleClass;

    public SampleClass307(){
        sampleClass = new SampleClass308();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}