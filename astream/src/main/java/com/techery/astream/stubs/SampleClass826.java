package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass826 {

    @Ignore    private SampleClass827 sampleClass;

    public SampleClass826(){
        sampleClass = new SampleClass827();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}