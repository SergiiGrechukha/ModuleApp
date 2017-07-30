package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass537 {

    @Ignore    private SampleClass538 sampleClass;

    public SampleClass537(){
        sampleClass = new SampleClass538();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}