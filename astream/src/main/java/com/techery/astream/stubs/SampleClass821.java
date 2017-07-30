package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass821 {

    @Ignore    private SampleClass822 sampleClass;

    public SampleClass821(){
        sampleClass = new SampleClass822();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}