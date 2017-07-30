package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1529 {

    @Ignore    private SampleClass1530 sampleClass;

    public SampleClass1529(){
        sampleClass = new SampleClass1530();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}