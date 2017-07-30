package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1959 {

    @Ignore    private SampleClass1960 sampleClass;

    public SampleClass1959(){
        sampleClass = new SampleClass1960();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}