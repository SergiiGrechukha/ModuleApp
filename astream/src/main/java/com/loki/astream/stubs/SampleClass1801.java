package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1801 {

    @Ignore    private SampleClass1802 sampleClass;

    public SampleClass1801(){
        sampleClass = new SampleClass1802();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}