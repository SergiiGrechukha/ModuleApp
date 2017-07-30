package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass813 {

    @Ignore    private SampleClass814 sampleClass;

    public SampleClass813(){
        sampleClass = new SampleClass814();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}