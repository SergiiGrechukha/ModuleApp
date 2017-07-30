package com.techery.bstream.stubs;

public class SampleClass2100 {

    private SampleClass2101 sampleClass;

    public SampleClass2100(){
        sampleClass = new SampleClass2101();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}