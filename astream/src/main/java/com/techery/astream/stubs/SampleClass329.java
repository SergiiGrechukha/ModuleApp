package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass329 {

    @Ignore    private SampleClass330 sampleClass;

    public SampleClass329(){
        sampleClass = new SampleClass330();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}