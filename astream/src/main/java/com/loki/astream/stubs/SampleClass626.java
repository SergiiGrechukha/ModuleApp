package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass626 {

    @Ignore    private SampleClass627 sampleClass;

    public SampleClass626(){
        sampleClass = new SampleClass627();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}