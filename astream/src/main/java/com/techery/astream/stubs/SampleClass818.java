package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass818 {

    @Ignore    private SampleClass819 sampleClass;

    public SampleClass818(){
        sampleClass = new SampleClass819();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}