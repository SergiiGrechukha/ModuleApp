package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass345 {

    @Ignore    private SampleClass346 sampleClass;

    public SampleClass345(){
        sampleClass = new SampleClass346();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}