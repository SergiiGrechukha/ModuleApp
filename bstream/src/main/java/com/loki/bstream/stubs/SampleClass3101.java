package com.loki.bstream.stubs;

public class SampleClass3101 {

    private SampleClass3102 sampleClass;

    public SampleClass3101(){
        sampleClass = new SampleClass3102();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}