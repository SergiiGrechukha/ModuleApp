package com.techery.bstream.stubs;

public class SampleClass3003 {

    private SampleClass3004 sampleClass;

    public SampleClass3003(){
        sampleClass = new SampleClass3004();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}