package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1508 {

    @Ignore    private SampleClass1509 sampleClass;

    public SampleClass1508(){
        sampleClass = new SampleClass1509();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}