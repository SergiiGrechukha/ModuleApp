package com.loki.cstream.stubs;

public class SampleClass5200 {

    private SampleClass5201 sampleClass;

    public SampleClass5200(){
        sampleClass = new SampleClass5201();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}