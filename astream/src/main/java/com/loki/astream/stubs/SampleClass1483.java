package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1483 {

    @Ignore    private SampleClass1484 sampleClass;

    public SampleClass1483(){
        sampleClass = new SampleClass1484();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}