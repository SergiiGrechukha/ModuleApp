package com.techery.cstream.stubs;

public class SampleClass5003 {

    private SampleClass5004 sampleClass;

    public SampleClass5003(){
        sampleClass = new SampleClass5004();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}