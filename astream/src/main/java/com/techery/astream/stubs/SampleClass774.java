package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass774 {

    @Ignore    private SampleClass775 sampleClass;

    public SampleClass774(){
        sampleClass = new SampleClass775();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}