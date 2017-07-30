package com.techery.bstream.stubs;

public class SampleClass3200 {

    private SampleClass3201 sampleClass;

    public SampleClass3200(){
        sampleClass = new SampleClass3201();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}