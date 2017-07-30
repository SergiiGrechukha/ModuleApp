package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass204 {

    @Ignore    private SampleClass205 sampleClass;

    public SampleClass204(){
        sampleClass = new SampleClass205();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}