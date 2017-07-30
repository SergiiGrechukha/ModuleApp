package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass909 {

    @Ignore    private SampleClass910 sampleClass;

    public SampleClass909(){
        sampleClass = new SampleClass910();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}