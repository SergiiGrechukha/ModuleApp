package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1989 {

    @Ignore    private SampleClass1990 sampleClass;

    public SampleClass1989(){
        sampleClass = new SampleClass1990();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}