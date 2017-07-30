package com.techery.cstream.stubs;

public class SampleClass4100 {

    private SampleClass4101 sampleClass;

    public SampleClass4100(){
        sampleClass = new SampleClass4101();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}