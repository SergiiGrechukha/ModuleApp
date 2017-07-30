package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1895 {

    @Ignore    private SampleClass1896 sampleClass;

    public SampleClass1895(){
        sampleClass = new SampleClass1896();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}