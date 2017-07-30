package com.techery.bstream.stubs;

public class SampleClass2014 {

    private SampleClass2015 sampleClass;

    public SampleClass2014(){
        sampleClass = new SampleClass2015();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}