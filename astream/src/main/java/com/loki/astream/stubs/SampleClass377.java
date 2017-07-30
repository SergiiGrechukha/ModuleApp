package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass377 {

    @Ignore    private SampleClass378 sampleClass;

    public SampleClass377(){
        sampleClass = new SampleClass378();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}