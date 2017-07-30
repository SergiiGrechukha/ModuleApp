package com.techery.cstream.stubs;

public class SampleClass5100 {

    private SampleClass5101 sampleClass;

    public SampleClass5100(){
        sampleClass = new SampleClass5101();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}