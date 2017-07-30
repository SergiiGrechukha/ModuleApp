package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass931 {

    @Ignore    private SampleClass932 sampleClass;

    public SampleClass931(){
        sampleClass = new SampleClass932();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}