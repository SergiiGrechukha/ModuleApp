package com.techery.cstream.stubs;

public class SampleClass4001 {

    private SampleClass4002 sampleClass;

    public SampleClass4001(){
        sampleClass = new SampleClass4002();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}