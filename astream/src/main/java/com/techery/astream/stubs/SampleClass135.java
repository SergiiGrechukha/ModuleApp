package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass135 {

    @Ignore    private SampleClass136 sampleClass;

    public SampleClass135(){
        sampleClass = new SampleClass136();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}