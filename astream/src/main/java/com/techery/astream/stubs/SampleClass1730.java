package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1730 {

    @Ignore    private SampleClass1731 sampleClass;

    public SampleClass1730(){
        sampleClass = new SampleClass1731();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}