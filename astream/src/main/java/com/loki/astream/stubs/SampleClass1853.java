package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1853 {

    @Ignore    private SampleClass1854 sampleClass;

    public SampleClass1853(){
        sampleClass = new SampleClass1854();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}