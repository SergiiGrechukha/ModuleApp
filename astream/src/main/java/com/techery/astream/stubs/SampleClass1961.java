package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1961 {

    @Ignore    private SampleClass1962 sampleClass;

    public SampleClass1961(){
        sampleClass = new SampleClass1962();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}