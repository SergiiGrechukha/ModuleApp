package com.techery.bstream.stubs;

public class SampleClass2016 {

    private SampleClass2017 sampleClass;

    public SampleClass2016(){
        sampleClass = new SampleClass2017();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}