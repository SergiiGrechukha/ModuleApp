package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass180 {

    @Ignore    private SampleClass181 sampleClass;

    public SampleClass180(){
        sampleClass = new SampleClass181();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}