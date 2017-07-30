package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass33 {

    @Ignore    private SampleClass34 sampleClass;

    public SampleClass33(){
        sampleClass = new SampleClass34();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}