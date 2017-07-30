package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass458 {

    @Ignore    private SampleClass459 sampleClass;

    public SampleClass458(){
        sampleClass = new SampleClass459();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}