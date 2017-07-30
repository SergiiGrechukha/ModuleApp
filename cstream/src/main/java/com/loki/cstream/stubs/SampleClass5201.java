package com.loki.cstream.stubs;

public class SampleClass5201 {

    private SampleClass5202 sampleClass;

    public SampleClass5201(){
        sampleClass = new SampleClass5202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}