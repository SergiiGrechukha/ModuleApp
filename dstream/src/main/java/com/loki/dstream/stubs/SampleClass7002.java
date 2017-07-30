package com.loki.dstream.stubs;

public class SampleClass7002 {

    private SampleClass7003 sampleClass;

    public SampleClass7002(){
        sampleClass = new SampleClass7003();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}