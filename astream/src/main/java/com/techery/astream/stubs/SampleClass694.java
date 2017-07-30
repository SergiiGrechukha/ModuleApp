package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass694 {

    @Ignore    private SampleClass695 sampleClass;

    public SampleClass694(){
        sampleClass = new SampleClass695();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}