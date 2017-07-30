package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass438 {

    @Ignore    private SampleClass439 sampleClass;

    public SampleClass438(){
        sampleClass = new SampleClass439();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}