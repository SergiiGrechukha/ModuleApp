package com.techery.bstream.stubs;

public class SampleClass2004 {

    private SampleClass2005 sampleClass;

    public SampleClass2004(){
        sampleClass = new SampleClass2005();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}