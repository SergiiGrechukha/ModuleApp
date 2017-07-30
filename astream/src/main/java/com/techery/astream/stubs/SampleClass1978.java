package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1978 {

    @Ignore    private SampleClass1979 sampleClass;

    public SampleClass1978(){
        sampleClass = new SampleClass1979();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}