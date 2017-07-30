package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass349 {

    @Ignore    private SampleClass350 sampleClass;

    public SampleClass349(){
        sampleClass = new SampleClass350();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}