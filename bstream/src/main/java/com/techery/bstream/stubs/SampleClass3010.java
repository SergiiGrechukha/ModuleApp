package com.techery.bstream.stubs;

public class SampleClass3010 {

    private SampleClass3011 sampleClass;

    public SampleClass3010(){
        sampleClass = new SampleClass3011();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}