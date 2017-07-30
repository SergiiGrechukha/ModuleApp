package com.loki.cstream.stubs;

public class SampleClass4000 {

    private SampleClass4001 sampleClass;

    public SampleClass4000(){
        sampleClass = new SampleClass4001();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}