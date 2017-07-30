package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass692 {

    @Ignore    private SampleClass693 sampleClass;

    public SampleClass692(){
        sampleClass = new SampleClass693();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}