package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass12 {

    @Ignore    private SampleClass13 sampleClass;

    public SampleClass12(){
        sampleClass = new SampleClass13();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}