package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1909 {

    @Ignore    private SampleClass1910 sampleClass;

    public SampleClass1909(){
        sampleClass = new SampleClass1910();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}