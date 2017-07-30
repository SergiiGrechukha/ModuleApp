package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1364 {

    @Ignore    private SampleClass1365 sampleClass;

    public SampleClass1364(){
        sampleClass = new SampleClass1365();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}