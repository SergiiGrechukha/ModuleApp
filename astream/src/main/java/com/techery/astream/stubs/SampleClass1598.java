package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1598 {

    @Ignore    private SampleClass1599 sampleClass;

    public SampleClass1598(){
        sampleClass = new SampleClass1599();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}