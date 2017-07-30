package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass280 {

    @Ignore    private SampleClass281 sampleClass;

    public SampleClass280(){
        sampleClass = new SampleClass281();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}