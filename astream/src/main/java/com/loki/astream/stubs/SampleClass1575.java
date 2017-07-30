package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1575 {

    @Ignore    private SampleClass1576 sampleClass;

    public SampleClass1575(){
        sampleClass = new SampleClass1576();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}