package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1404 {

    @Ignore    private SampleClass1405 sampleClass;

    public SampleClass1404(){
        sampleClass = new SampleClass1405();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}