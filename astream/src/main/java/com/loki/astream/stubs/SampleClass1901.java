package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1901 {

    @Ignore    private SampleClass1902 sampleClass;

    public SampleClass1901(){
        sampleClass = new SampleClass1902();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}