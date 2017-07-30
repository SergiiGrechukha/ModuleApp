package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass363 {

    @Ignore    private SampleClass364 sampleClass;

    public SampleClass363(){
        sampleClass = new SampleClass364();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}