package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass708 {

    @Ignore    private SampleClass709 sampleClass;

    public SampleClass708(){
        sampleClass = new SampleClass709();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}