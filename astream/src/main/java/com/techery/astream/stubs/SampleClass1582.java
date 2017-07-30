package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1582 {

    @Ignore    private SampleClass1583 sampleClass;

    public SampleClass1582(){
        sampleClass = new SampleClass1583();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}