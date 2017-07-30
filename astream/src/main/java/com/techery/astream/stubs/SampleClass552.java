package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass552 {

    @Ignore    private SampleClass553 sampleClass;

    public SampleClass552(){
        sampleClass = new SampleClass553();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}