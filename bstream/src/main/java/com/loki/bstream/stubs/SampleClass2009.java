package com.loki.bstream.stubs;

public class SampleClass2009 {

    private SampleClass2010 sampleClass;

    public SampleClass2009(){
        sampleClass = new SampleClass2010();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}