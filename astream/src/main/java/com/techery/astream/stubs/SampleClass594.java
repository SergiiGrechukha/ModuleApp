package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass594 {

    @Ignore    private SampleClass595 sampleClass;

    public SampleClass594(){
        sampleClass = new SampleClass595();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}