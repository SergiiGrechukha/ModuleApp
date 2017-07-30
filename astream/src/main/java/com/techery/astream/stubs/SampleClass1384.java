package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1384 {

    @Ignore    private SampleClass1385 sampleClass;

    public SampleClass1384(){
        sampleClass = new SampleClass1385();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}