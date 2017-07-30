package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1930 {

    @Ignore    private SampleClass1931 sampleClass;

    public SampleClass1930(){
        sampleClass = new SampleClass1931();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}