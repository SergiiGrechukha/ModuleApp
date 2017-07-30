package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass347 {

    @Ignore    private SampleClass348 sampleClass;

    public SampleClass347(){
        sampleClass = new SampleClass348();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}