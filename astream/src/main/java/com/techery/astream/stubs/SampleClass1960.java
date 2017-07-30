package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1960 {

    @Ignore    private SampleClass1961 sampleClass;

    public SampleClass1960(){
        sampleClass = new SampleClass1961();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}