package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1910 {

    @Ignore    private SampleClass1911 sampleClass;

    public SampleClass1910(){
        sampleClass = new SampleClass1911();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}