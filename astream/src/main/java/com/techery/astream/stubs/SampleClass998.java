package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass998 {

    @Ignore    private SampleClass999 sampleClass;

    public SampleClass998(){
        sampleClass = new SampleClass999();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}