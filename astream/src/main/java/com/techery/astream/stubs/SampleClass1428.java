package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1428 {

    @Ignore    private SampleClass1429 sampleClass;

    public SampleClass1428(){
        sampleClass = new SampleClass1429();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}