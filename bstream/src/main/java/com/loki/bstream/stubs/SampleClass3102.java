package com.loki.bstream.stubs;

public class SampleClass3102 {

    private SampleClass3103 sampleClass;

    public SampleClass3102(){
        sampleClass = new SampleClass3103();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}