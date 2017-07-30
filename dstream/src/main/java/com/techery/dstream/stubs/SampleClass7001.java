package com.techery.dstream.stubs;

public class SampleClass7001 {

    private SampleClass7002 sampleClass;

    public SampleClass7001(){
        sampleClass = new SampleClass7002();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}