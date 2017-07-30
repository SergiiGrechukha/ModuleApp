package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass839 {

    @Ignore    private SampleClass840 sampleClass;

    public SampleClass839(){
        sampleClass = new SampleClass840();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}