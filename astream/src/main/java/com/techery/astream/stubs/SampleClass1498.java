package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1498 {

    @Ignore    private SampleClass1499 sampleClass;

    public SampleClass1498(){
        sampleClass = new SampleClass1499();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}