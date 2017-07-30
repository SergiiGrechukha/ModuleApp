package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass816 {

    @Ignore    private SampleClass817 sampleClass;

    public SampleClass816(){
        sampleClass = new SampleClass817();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}