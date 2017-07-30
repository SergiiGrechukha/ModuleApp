package com.loki.cstream.stubs;

public class SampleClass4101 {

    private SampleClass4102 sampleClass;

    public SampleClass4101(){
        sampleClass = new SampleClass4102();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}