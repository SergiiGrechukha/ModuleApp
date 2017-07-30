package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1471 {

    @Ignore    private SampleClass1472 sampleClass;

    public SampleClass1471(){
        sampleClass = new SampleClass1472();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}