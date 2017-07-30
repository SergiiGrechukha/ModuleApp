package com.loki.bstream.stubs;

public class SampleClass2010 {

    private SampleClass2011 sampleClass;

    public SampleClass2010(){
        sampleClass = new SampleClass2011();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}