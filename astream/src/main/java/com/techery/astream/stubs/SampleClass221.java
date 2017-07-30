package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass221 {

    @Ignore    private SampleClass222 sampleClass;

    public SampleClass221(){
        sampleClass = new SampleClass222();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}