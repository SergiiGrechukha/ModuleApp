package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass271 {

    @Ignore    private SampleClass272 sampleClass;

    public SampleClass271(){
        sampleClass = new SampleClass272();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}