package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1602 {

    @Ignore    private SampleClass1603 sampleClass;

    public SampleClass1602(){
        sampleClass = new SampleClass1603();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}