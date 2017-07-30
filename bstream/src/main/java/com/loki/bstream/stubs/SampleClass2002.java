package com.loki.bstream.stubs;

public class SampleClass2002 {

    private SampleClass2003 sampleClass;

    public SampleClass2002(){
        sampleClass = new SampleClass2003();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}