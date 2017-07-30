package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass60 {

    @Ignore    private SampleClass61 sampleClass;

    public SampleClass60(){
        sampleClass = new SampleClass61();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}