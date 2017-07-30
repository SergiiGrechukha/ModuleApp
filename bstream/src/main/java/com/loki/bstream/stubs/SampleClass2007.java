package com.loki.bstream.stubs;

public class SampleClass2007 {

    private SampleClass2008 sampleClass;

    public SampleClass2007(){
        sampleClass = new SampleClass2008();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}