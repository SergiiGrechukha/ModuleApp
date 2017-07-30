package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass563 {

    @Ignore    private SampleClass564 sampleClass;

    public SampleClass563(){
        sampleClass = new SampleClass564();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}