package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1651 {

    @Ignore    private SampleClass1652 sampleClass;

    public SampleClass1651(){
        sampleClass = new SampleClass1652();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}