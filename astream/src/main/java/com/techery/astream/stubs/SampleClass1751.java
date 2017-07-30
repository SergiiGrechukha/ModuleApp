package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1751 {

    @Ignore    private SampleClass1752 sampleClass;

    public SampleClass1751(){
        sampleClass = new SampleClass1752();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}