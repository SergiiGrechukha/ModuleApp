package com.loki.bstream.stubs;

public class SampleClass2015 {

    private SampleClass2016 sampleClass;

    public SampleClass2015(){
        sampleClass = new SampleClass2016();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}