package com.loki.bstream.stubs;

public class SampleClass2017 {

    private SampleClass2018 sampleClass;

    public SampleClass2017(){
        sampleClass = new SampleClass2018();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}