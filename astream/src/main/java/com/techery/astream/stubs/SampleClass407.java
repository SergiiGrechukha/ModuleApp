package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass407 {

    @Ignore    private SampleClass408 sampleClass;

    public SampleClass407(){
        sampleClass = new SampleClass408();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}