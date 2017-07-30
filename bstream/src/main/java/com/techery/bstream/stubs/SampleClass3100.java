package com.techery.bstream.stubs;

public class SampleClass3100 {

    private SampleClass3101 sampleClass;

    public SampleClass3100(){
        sampleClass = new SampleClass3101();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}