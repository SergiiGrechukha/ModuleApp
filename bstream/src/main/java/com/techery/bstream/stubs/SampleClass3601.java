package com.techery.bstream.stubs;

public class SampleClass3601 {

    private SampleClass3602 sampleClass;

    public SampleClass3601(){
        sampleClass = new SampleClass3602();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}