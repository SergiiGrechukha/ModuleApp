package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass636 {

    @Ignore    private SampleClass637 sampleClass;

    public SampleClass636(){
        sampleClass = new SampleClass637();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}