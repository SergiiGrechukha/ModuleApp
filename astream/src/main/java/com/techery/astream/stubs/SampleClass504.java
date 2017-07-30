package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass504 {

    @Ignore    private SampleClass505 sampleClass;

    public SampleClass504(){
        sampleClass = new SampleClass505();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}