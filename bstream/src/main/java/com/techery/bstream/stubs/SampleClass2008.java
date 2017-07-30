package com.techery.bstream.stubs;

public class SampleClass2008 {

    private SampleClass2009 sampleClass;

    public SampleClass2008(){
        sampleClass = new SampleClass2009();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}