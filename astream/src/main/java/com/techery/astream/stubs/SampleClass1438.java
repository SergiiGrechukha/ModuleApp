package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1438 {

    @Ignore    private SampleClass1439 sampleClass;

    public SampleClass1438(){
        sampleClass = new SampleClass1439();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}