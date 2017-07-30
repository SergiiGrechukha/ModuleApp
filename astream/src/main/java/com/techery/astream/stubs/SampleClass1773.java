package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1773 {

    @Ignore    private SampleClass1774 sampleClass;

    public SampleClass1773(){
        sampleClass = new SampleClass1774();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}