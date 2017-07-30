package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1748 {

    @Ignore    private SampleClass1749 sampleClass;

    public SampleClass1748(){
        sampleClass = new SampleClass1749();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}