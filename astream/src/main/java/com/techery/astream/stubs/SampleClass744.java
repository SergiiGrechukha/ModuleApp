package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass744 {

    @Ignore    private SampleClass745 sampleClass;

    public SampleClass744(){
        sampleClass = new SampleClass745();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}