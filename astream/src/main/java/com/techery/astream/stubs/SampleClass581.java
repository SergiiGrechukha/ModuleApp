package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass581 {

    @Ignore    private SampleClass582 sampleClass;

    public SampleClass581(){
        sampleClass = new SampleClass582();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}