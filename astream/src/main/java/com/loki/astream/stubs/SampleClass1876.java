package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1876 {

    @Ignore    private SampleClass1877 sampleClass;

    public SampleClass1876(){
        sampleClass = new SampleClass1877();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}