package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass94 {

    @Ignore    private SampleClass95 sampleClass;

    public SampleClass94(){
        sampleClass = new SampleClass95();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}