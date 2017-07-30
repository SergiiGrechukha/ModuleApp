package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass200 {

    @Ignore    private SampleClass201 sampleClass;

    public SampleClass200(){
        sampleClass = new SampleClass201();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}