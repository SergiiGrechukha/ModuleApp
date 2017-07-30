package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass528 {

    @Ignore    private SampleClass529 sampleClass;

    public SampleClass528(){
        sampleClass = new SampleClass529();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}