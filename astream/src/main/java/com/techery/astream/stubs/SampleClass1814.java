package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1814 {

    @Ignore    private SampleClass1815 sampleClass;

    public SampleClass1814(){
        sampleClass = new SampleClass1815();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}