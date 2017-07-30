package com.loki.bstream.stubs;

public class SampleClass2302 {

    private SampleClass2303 sampleClass;

    public SampleClass2302(){
        sampleClass = new SampleClass2303();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}