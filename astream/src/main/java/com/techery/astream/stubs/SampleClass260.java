package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass260 {

    @Ignore    private SampleClass261 sampleClass;

    public SampleClass260(){
        sampleClass = new SampleClass261();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}