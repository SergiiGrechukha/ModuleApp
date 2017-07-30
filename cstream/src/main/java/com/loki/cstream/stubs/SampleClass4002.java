package com.loki.cstream.stubs;

public class SampleClass4002 {

    private SampleClass4003 sampleClass;

    public SampleClass4002(){
        sampleClass = new SampleClass4003();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}