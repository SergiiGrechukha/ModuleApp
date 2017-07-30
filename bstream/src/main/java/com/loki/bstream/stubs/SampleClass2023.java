package com.loki.bstream.stubs;

public class SampleClass2023 {

    private SampleClass2024 sampleClass;

    public SampleClass2023(){
        sampleClass = new SampleClass2024();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}