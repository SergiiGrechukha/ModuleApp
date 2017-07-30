package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1491 {

    @Ignore    private SampleClass1492 sampleClass;

    public SampleClass1491(){
        sampleClass = new SampleClass1492();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}