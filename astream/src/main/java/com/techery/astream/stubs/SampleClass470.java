package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass470 {

    @Ignore    private SampleClass471 sampleClass;

    public SampleClass470(){
        sampleClass = new SampleClass471();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}