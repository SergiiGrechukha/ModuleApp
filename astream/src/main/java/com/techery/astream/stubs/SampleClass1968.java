package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1968 {

    @Ignore    private SampleClass1969 sampleClass;

    public SampleClass1968(){
        sampleClass = new SampleClass1969();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}