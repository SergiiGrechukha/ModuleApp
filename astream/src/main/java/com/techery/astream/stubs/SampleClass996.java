package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass996 {

    @Ignore    private SampleClass997 sampleClass;

    public SampleClass996(){
        sampleClass = new SampleClass997();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}