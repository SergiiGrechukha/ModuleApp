package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass729 {

    @Ignore    private SampleClass730 sampleClass;

    public SampleClass729(){
        sampleClass = new SampleClass730();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}