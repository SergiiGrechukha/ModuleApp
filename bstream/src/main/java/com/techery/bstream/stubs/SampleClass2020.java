package com.techery.bstream.stubs;

public class SampleClass2020 {

    private SampleClass2021 sampleClass;

    public SampleClass2020(){
        sampleClass = new SampleClass2021();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}