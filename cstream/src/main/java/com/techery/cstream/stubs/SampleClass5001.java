package com.techery.cstream.stubs;

public class SampleClass5001 {

    private SampleClass5002 sampleClass;

    public SampleClass5001(){
        sampleClass = new SampleClass5002();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}