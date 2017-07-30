package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1738 {

    @Ignore    private SampleClass1739 sampleClass;

    public SampleClass1738(){
        sampleClass = new SampleClass1739();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}