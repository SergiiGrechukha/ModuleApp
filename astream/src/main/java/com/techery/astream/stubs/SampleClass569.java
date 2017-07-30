package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass569 {

    @Ignore    private SampleClass570 sampleClass;

    public SampleClass569(){
        sampleClass = new SampleClass570();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}