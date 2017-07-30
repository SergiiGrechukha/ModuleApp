package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass484 {

    @Ignore    private SampleClass485 sampleClass;

    public SampleClass484(){
        sampleClass = new SampleClass485();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}