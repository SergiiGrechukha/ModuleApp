package com.techery.bstream.stubs;

public class SampleClass2200 {

    private SampleClass2201 sampleClass;

    public SampleClass2200(){
        sampleClass = new SampleClass2201();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}