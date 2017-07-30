package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass696 {

    @Ignore    private SampleClass697 sampleClass;

    public SampleClass696(){
        sampleClass = new SampleClass697();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}