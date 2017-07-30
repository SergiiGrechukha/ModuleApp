package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1108 {

    @Ignore    private SampleClass1109 sampleClass;

    public SampleClass1108(){
        sampleClass = new SampleClass1109();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}