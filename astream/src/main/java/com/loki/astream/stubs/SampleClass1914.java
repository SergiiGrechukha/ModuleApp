package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1914 {

    @Ignore    private SampleClass1915 sampleClass;

    public SampleClass1914(){
        sampleClass = new SampleClass1915();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}