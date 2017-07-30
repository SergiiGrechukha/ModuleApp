package com.loki.bstream.stubs;

public class SampleClass2022 {

    private SampleClass2023 sampleClass;

    public SampleClass2022(){
        sampleClass = new SampleClass2023();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}