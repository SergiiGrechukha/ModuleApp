package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1450 {

    @Ignore    private SampleClass1451 sampleClass;

    public SampleClass1450(){
        sampleClass = new SampleClass1451();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}