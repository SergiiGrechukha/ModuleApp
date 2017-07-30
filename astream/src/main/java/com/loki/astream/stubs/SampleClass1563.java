package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1563 {

    @Ignore    private SampleClass1564 sampleClass;

    public SampleClass1563(){
        sampleClass = new SampleClass1564();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}