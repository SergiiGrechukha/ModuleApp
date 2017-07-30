package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass910 {

    @Ignore    private SampleClass911 sampleClass;

    public SampleClass910(){
        sampleClass = new SampleClass911();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}