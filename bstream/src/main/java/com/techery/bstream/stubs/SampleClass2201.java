package com.techery.bstream.stubs;

public class SampleClass2201 {

    private SampleClass2202 sampleClass;

    public SampleClass2201(){
        sampleClass = new SampleClass2202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}