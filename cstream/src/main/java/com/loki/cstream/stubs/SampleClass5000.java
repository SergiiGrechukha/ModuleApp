package com.loki.cstream.stubs;

public class SampleClass5000 {

    private SampleClass5001 sampleClass;

    public SampleClass5000(){
        sampleClass = new SampleClass5001();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}