package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass667 {

    @Ignore    private SampleClass668 sampleClass;

    public SampleClass667(){
        sampleClass = new SampleClass668();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}