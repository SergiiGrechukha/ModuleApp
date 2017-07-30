package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass553 {

    @Ignore    private SampleClass554 sampleClass;

    public SampleClass553(){
        sampleClass = new SampleClass554();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}