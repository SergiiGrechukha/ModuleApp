package com.loki.bstream.stubs;

public class SampleClass2006 {

    private SampleClass2007 sampleClass;

    public SampleClass2006(){
        sampleClass = new SampleClass2007();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}