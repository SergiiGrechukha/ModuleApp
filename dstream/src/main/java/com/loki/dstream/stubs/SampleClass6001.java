package com.loki.dstream.stubs;

public class SampleClass6001 {

    private SampleClass6002 sampleClass;

    public SampleClass6001(){
        sampleClass = new SampleClass6002();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}