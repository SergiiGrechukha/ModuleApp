package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass935 {

    @Ignore    private SampleClass936 sampleClass;

    public SampleClass935(){
        sampleClass = new SampleClass936();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}