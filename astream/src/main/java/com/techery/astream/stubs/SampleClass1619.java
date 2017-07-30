package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1619 {

    @Ignore    private SampleClass1620 sampleClass;

    public SampleClass1619(){
        sampleClass = new SampleClass1620();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}