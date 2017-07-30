package com.techery.cstream.stubs;

public class SampleClass5002 {

    private SampleClass5003 sampleClass;

    public SampleClass5002(){
        sampleClass = new SampleClass5003();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}