package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass100 {

    @Ignore    private SampleClass101 sampleClass;

    public SampleClass100(){
        sampleClass = new SampleClass101();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}