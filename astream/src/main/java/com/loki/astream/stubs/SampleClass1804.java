package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1804 {

    @Ignore    private SampleClass1805 sampleClass;

    public SampleClass1804(){
        sampleClass = new SampleClass1805();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}