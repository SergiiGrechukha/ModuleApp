package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass354 {

    @Ignore    private SampleClass355 sampleClass;

    public SampleClass354(){
        sampleClass = new SampleClass355();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}