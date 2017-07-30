package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1874 {

    @Ignore    private SampleClass1875 sampleClass;

    public SampleClass1874(){
        sampleClass = new SampleClass1875();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}