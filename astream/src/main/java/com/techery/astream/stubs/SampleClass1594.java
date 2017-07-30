package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1594 {

    @Ignore    private SampleClass1595 sampleClass;

    public SampleClass1594(){
        sampleClass = new SampleClass1595();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}