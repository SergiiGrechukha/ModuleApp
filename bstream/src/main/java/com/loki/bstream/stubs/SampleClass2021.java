package com.loki.bstream.stubs;

public class SampleClass2021 {

    private SampleClass2022 sampleClass;

    public SampleClass2021(){
        sampleClass = new SampleClass2022();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}