package com.techery.bstream.stubs;

public class SampleClass2019 {

    private SampleClass2020 sampleClass;

    public SampleClass2019(){
        sampleClass = new SampleClass2020();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}