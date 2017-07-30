package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1100 {

    @Ignore    private SampleClass1101 sampleClass;

    public SampleClass1100(){
        sampleClass = new SampleClass1101();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}