package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass36 {

    @Ignore    private SampleClass37 sampleClass;

    public SampleClass36(){
        sampleClass = new SampleClass37();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}