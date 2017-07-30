package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass932 {

    @Ignore    private SampleClass933 sampleClass;

    public SampleClass932(){
        sampleClass = new SampleClass933();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}