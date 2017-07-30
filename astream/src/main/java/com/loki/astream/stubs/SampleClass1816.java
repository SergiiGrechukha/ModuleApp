package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1816 {

    @Ignore    private SampleClass1817 sampleClass;

    public SampleClass1816(){
        sampleClass = new SampleClass1817();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}