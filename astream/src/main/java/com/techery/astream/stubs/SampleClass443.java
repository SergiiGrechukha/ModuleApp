package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass443 {

    @Ignore    private SampleClass444 sampleClass;

    public SampleClass443(){
        sampleClass = new SampleClass444();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}