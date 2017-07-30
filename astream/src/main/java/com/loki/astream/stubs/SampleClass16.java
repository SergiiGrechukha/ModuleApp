package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass16 {

    @Ignore    private SampleClass17 sampleClass;

    public SampleClass16(){
        sampleClass = new SampleClass17();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}