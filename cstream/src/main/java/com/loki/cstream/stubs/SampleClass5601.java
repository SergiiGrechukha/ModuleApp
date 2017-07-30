package com.loki.cstream.stubs;

public class SampleClass5601 {

    private SampleClass5602 sampleClass;

    public SampleClass5601(){
        sampleClass = new SampleClass5602();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}