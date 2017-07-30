package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1528 {

    @Ignore    private SampleClass1529 sampleClass;

    public SampleClass1528(){
        sampleClass = new SampleClass1529();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}