package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1351 {

    @Ignore    private SampleClass1352 sampleClass;

    public SampleClass1351(){
        sampleClass = new SampleClass1352();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}