package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass65 {

    @Ignore    private SampleClass66 sampleClass;

    public SampleClass65(){
        sampleClass = new SampleClass66();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}