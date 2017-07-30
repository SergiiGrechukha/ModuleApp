package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1724 {

    @Ignore    private SampleClass1725 sampleClass;

    public SampleClass1724(){
        sampleClass = new SampleClass1725();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}