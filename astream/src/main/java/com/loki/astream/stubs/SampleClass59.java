package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass59 {

    @Ignore    private SampleClass60 sampleClass;

    public SampleClass59(){
        sampleClass = new SampleClass60();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}