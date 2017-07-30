package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass192 {

    @Ignore    private SampleClass193 sampleClass;

    public SampleClass192(){
        sampleClass = new SampleClass193();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}