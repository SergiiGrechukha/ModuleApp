package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass546 {

    @Ignore    private SampleClass547 sampleClass;

    public SampleClass546(){
        sampleClass = new SampleClass547();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}