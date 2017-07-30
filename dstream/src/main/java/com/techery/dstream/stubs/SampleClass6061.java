package com.techery.dstream.stubs;

public class SampleClass6061 {

    private SampleClass6062 sampleClass;

    public SampleClass6061(){
        sampleClass = new SampleClass6062();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}