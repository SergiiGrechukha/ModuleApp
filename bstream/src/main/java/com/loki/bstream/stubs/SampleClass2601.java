package com.loki.bstream.stubs;

public class SampleClass2601 {

    private SampleClass2602 sampleClass;

    public SampleClass2601(){
        sampleClass = new SampleClass2602();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}