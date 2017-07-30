package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass947 {

    @Ignore    private SampleClass948 sampleClass;

    public SampleClass947(){
        sampleClass = new SampleClass948();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}