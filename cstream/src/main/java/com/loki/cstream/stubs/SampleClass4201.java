package com.loki.cstream.stubs;

public class SampleClass4201 {

    private SampleClass4202 sampleClass;

    public SampleClass4201(){
        sampleClass = new SampleClass4202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}