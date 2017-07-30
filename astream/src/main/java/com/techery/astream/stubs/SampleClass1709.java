package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1709 {

    @Ignore    private SampleClass1710 sampleClass;

    public SampleClass1709(){
        sampleClass = new SampleClass1710();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}