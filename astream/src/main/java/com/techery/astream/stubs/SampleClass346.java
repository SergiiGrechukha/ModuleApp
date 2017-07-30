package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass346 {

    @Ignore    private SampleClass347 sampleClass;

    public SampleClass346(){
        sampleClass = new SampleClass347();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}