package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1962 {

    @Ignore    private SampleClass1963 sampleClass;

    public SampleClass1962(){
        sampleClass = new SampleClass1963();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}