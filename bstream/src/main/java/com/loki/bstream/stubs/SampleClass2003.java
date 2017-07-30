package com.loki.bstream.stubs;

public class SampleClass2003 {

    private SampleClass2004 sampleClass;

    public SampleClass2003(){
        sampleClass = new SampleClass2004();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}