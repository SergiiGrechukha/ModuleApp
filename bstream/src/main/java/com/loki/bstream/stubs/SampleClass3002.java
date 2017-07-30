package com.loki.bstream.stubs;

public class SampleClass3002 {

    private SampleClass3003 sampleClass;

    public SampleClass3002(){
        sampleClass = new SampleClass3003();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}