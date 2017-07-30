package com.techery.bstream.stubs;

public class SampleClass2012 {

    private SampleClass2013 sampleClass;

    public SampleClass2012(){
        sampleClass = new SampleClass2013();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}