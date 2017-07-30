package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1532 {

    @Ignore    private SampleClass1533 sampleClass;

    public SampleClass1532(){
        sampleClass = new SampleClass1533();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}