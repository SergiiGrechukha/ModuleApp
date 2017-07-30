package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass566 {

    @Ignore    private SampleClass567 sampleClass;

    public SampleClass566(){
        sampleClass = new SampleClass567();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}