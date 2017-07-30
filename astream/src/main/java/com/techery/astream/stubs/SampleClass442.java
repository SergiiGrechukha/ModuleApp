package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass442 {

    @Ignore    private SampleClass443 sampleClass;

    public SampleClass442(){
        sampleClass = new SampleClass443();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}