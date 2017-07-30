package com.loki.bstream.stubs;

public class SampleClass2001 {

    private SampleClass2002 sampleClass;

    public SampleClass2001(){
        sampleClass = new SampleClass2002();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}