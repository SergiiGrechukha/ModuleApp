package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass368 {

    @Ignore    private SampleClass369 sampleClass;

    public SampleClass368(){
        sampleClass = new SampleClass369();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}