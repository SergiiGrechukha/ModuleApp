package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass936 {

    @Ignore    private SampleClass937 sampleClass;

    public SampleClass936(){
        sampleClass = new SampleClass937();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}