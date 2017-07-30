package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass768 {

    @Ignore    private SampleClass769 sampleClass;

    public SampleClass768(){
        sampleClass = new SampleClass769();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}