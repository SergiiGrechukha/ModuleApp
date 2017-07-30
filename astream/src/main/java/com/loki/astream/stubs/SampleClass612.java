package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass612 {

    @Ignore    private SampleClass613 sampleClass;

    public SampleClass612(){
        sampleClass = new SampleClass613();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}