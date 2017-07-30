package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass814 {

    @Ignore    private SampleClass815 sampleClass;

    public SampleClass814(){
        sampleClass = new SampleClass815();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}