package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1609 {

    @Ignore    private SampleClass1610 sampleClass;

    public SampleClass1609(){
        sampleClass = new SampleClass1610();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}