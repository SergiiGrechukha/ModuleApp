package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1643 {

    @Ignore    private SampleClass1644 sampleClass;

    public SampleClass1643(){
        sampleClass = new SampleClass1644();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}