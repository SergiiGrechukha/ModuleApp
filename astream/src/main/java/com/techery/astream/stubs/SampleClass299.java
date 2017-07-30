package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass299 {

    @Ignore    private SampleClass300 sampleClass;

    public SampleClass299(){
        sampleClass = new SampleClass300();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}