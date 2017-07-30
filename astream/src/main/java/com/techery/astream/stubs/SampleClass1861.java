package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1861 {

    @Ignore    private SampleClass1862 sampleClass;

    public SampleClass1861(){
        sampleClass = new SampleClass1862();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}