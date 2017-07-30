package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1811 {

    @Ignore    private SampleClass1812 sampleClass;

    public SampleClass1811(){
        sampleClass = new SampleClass1812();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}