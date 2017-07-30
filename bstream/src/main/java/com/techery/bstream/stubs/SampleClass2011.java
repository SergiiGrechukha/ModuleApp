package com.techery.bstream.stubs;

public class SampleClass2011 {

    private SampleClass2012 sampleClass;

    public SampleClass2011(){
        sampleClass = new SampleClass2012();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}