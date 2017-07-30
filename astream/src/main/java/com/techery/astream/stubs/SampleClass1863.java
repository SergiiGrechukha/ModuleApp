package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1863 {

    @Ignore    private SampleClass1864 sampleClass;

    public SampleClass1863(){
        sampleClass = new SampleClass1864();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}