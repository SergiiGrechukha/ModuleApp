package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass250 {

    @Ignore    private SampleClass251 sampleClass;

    public SampleClass250(){
        sampleClass = new SampleClass251();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}