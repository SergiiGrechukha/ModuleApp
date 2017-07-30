package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1344 {

    @Ignore    private SampleClass1345 sampleClass;

    public SampleClass1344(){
        sampleClass = new SampleClass1345();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}