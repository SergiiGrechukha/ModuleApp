package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass400 {

    @Ignore    private SampleClass401 sampleClass;

    public SampleClass400(){
        sampleClass = new SampleClass401();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}