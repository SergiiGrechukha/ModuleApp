package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1472 {

    @Ignore    private SampleClass1473 sampleClass;

    public SampleClass1472(){
        sampleClass = new SampleClass1473();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}