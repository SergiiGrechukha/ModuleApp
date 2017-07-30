package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass750 {

    @Ignore    private SampleClass751 sampleClass;

    public SampleClass750(){
        sampleClass = new SampleClass751();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}