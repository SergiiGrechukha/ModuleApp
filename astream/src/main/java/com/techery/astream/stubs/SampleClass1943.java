package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1943 {

    @Ignore    private SampleClass1944 sampleClass;

    public SampleClass1943(){
        sampleClass = new SampleClass1944();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}