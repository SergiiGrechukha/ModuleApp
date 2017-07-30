package com.loki.cstream.stubs;

public class SampleClass4102 {

    private SampleClass4103 sampleClass;

    public SampleClass4102(){
        sampleClass = new SampleClass4103();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}