package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass411 {

    @Ignore    private SampleClass412 sampleClass;

    public SampleClass411(){
        sampleClass = new SampleClass412();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}