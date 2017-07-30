package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass320 {

    @Ignore    private SampleClass321 sampleClass;

    public SampleClass320(){
        sampleClass = new SampleClass321();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}