package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass519 {

    @Ignore    private SampleClass520 sampleClass;

    public SampleClass519(){
        sampleClass = new SampleClass520();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}