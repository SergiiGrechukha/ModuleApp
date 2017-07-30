package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1527 {

    @Ignore    private SampleClass1528 sampleClass;

    public SampleClass1527(){
        sampleClass = new SampleClass1528();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}