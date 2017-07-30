package com.loki.bstream.stubs;

public class SampleClass2018 {

    private SampleClass2019 sampleClass;

    public SampleClass2018(){
        sampleClass = new SampleClass2019();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}