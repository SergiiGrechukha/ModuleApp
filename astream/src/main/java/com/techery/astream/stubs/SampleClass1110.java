package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1110 {

    @Ignore    private SampleClass1111 sampleClass;

    public SampleClass1110(){
        sampleClass = new SampleClass1111();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}