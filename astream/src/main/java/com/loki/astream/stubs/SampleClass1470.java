package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1470 {

    @Ignore    private SampleClass1471 sampleClass;

    public SampleClass1470(){
        sampleClass = new SampleClass1471();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}