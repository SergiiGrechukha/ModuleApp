package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass193 {

    @Ignore    private SampleClass194 sampleClass;

    public SampleClass193(){
        sampleClass = new SampleClass194();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}