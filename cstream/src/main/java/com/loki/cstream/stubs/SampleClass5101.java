package com.loki.cstream.stubs;

public class SampleClass5101 {

    private SampleClass5102 sampleClass;

    public SampleClass5101(){
        sampleClass = new SampleClass5102();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}