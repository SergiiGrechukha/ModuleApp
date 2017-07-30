package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass637 {

    @Ignore    private SampleClass638 sampleClass;

    public SampleClass637(){
        sampleClass = new SampleClass638();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}