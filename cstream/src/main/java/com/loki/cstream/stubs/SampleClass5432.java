package com.loki.cstream.stubs;

public class SampleClass5432 {

    private SampleClass5433 sampleClass;

    public SampleClass5432(){
        sampleClass = new SampleClass5433();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}