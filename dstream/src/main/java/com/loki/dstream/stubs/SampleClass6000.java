package com.loki.dstream.stubs;

public class SampleClass6000 {

    private SampleClass6001 sampleClass;

    public SampleClass6000(){
        sampleClass = new SampleClass6001();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}