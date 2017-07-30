package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1164 {

    @Ignore    private SampleClass1165 sampleClass;

    public SampleClass1164(){
        sampleClass = new SampleClass1165();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}