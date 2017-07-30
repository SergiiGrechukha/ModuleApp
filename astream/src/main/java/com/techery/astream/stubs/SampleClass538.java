package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass538 {

    @Ignore    private SampleClass539 sampleClass;

    public SampleClass538(){
        sampleClass = new SampleClass539();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}