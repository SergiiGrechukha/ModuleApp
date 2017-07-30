package com.loki.bstream.stubs;

public class SampleClass3000 {

    private SampleClass3001 sampleClass;

    public SampleClass3000(){
        sampleClass = new SampleClass3001();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}