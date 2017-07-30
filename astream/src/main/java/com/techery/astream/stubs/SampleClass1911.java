package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1911 {

    @Ignore    private SampleClass1912 sampleClass;

    public SampleClass1911(){
        sampleClass = new SampleClass1912();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}