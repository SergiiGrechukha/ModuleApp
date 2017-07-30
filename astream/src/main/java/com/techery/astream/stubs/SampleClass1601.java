package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1601 {

    @Ignore    private SampleClass1602 sampleClass;

    public SampleClass1601(){
        sampleClass = new SampleClass1602();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}