package com.loki.bstream.stubs;

public class SampleClass2005 {

    private SampleClass2006 sampleClass;

    public SampleClass2005(){
        sampleClass = new SampleClass2006();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}