package com.techery.cstream.stubs;

public class SampleClass4003 {

    private SampleClass4004 sampleClass;

    public SampleClass4003(){
        sampleClass = new SampleClass4004();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}