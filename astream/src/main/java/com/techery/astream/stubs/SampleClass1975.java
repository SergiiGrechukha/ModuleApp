package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1975 {

    @Ignore    private SampleClass1976 sampleClass;

    public SampleClass1975(){
        sampleClass = new SampleClass1976();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}