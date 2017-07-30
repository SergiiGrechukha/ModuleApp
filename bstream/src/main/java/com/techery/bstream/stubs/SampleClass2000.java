package com.techery.bstream.stubs;

public class SampleClass2000 {

    private SampleClass2001 sampleClass;

    public SampleClass2000(){
        sampleClass = new SampleClass2001();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}