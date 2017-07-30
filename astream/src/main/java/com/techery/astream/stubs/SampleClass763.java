package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass763 {

    @Ignore    private SampleClass764 sampleClass;

    public SampleClass763(){
        sampleClass = new SampleClass764();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}