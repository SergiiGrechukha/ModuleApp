package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1570 {

    @Ignore    private SampleClass1571 sampleClass;

    public SampleClass1570(){
        sampleClass = new SampleClass1571();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}