package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1897 {

    @Ignore    private SampleClass1898 sampleClass;

    public SampleClass1897(){
        sampleClass = new SampleClass1898();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}