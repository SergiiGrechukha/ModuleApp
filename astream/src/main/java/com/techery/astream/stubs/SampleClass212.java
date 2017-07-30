package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass212 {

    @Ignore    private SampleClass213 sampleClass;

    public SampleClass212(){
        sampleClass = new SampleClass213();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}