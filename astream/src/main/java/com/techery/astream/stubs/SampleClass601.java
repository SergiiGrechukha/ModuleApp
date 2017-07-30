package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass601 {

    @Ignore    private SampleClass602 sampleClass;

    public SampleClass601(){
        sampleClass = new SampleClass602();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}