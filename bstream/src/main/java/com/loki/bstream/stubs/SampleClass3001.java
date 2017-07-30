package com.loki.bstream.stubs;

public class SampleClass3001 {

    private SampleClass3002 sampleClass;

    public SampleClass3001(){
        sampleClass = new SampleClass3002();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}