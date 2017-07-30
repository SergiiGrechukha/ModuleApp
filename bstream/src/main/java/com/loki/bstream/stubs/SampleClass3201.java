package com.loki.bstream.stubs;

public class SampleClass3201 {

    private SampleClass3202 sampleClass;

    public SampleClass3201(){
        sampleClass = new SampleClass3202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}