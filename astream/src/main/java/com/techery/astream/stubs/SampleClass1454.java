package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1454 {

    @Ignore    private SampleClass1455 sampleClass;

    public SampleClass1454(){
        sampleClass = new SampleClass1455();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}