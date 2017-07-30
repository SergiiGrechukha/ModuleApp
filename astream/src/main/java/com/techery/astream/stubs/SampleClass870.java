package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass870 {

    @Ignore    private SampleClass871 sampleClass;

    public SampleClass870(){
        sampleClass = new SampleClass871();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}