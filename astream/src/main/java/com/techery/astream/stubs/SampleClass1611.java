package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1611 {

    @Ignore    private SampleClass1612 sampleClass;

    public SampleClass1611(){
        sampleClass = new SampleClass1612();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}