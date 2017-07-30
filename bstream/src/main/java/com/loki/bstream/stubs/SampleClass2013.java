package com.loki.bstream.stubs;

public class SampleClass2013 {

    private SampleClass2014 sampleClass;

    public SampleClass2013(){
        sampleClass = new SampleClass2014();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}