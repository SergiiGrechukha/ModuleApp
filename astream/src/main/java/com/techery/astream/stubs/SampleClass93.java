package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass93 {

    @Ignore    private SampleClass94 sampleClass;

    public SampleClass93(){
        sampleClass = new SampleClass94();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}