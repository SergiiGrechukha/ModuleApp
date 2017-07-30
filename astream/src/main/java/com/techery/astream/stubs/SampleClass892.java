package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass892 {

    @Ignore    private SampleClass893 sampleClass;

    public SampleClass892(){
        sampleClass = new SampleClass893();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}