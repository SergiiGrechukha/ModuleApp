package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1487 {

    @Ignore    private SampleClass1488 sampleClass;

    public SampleClass1487(){
        sampleClass = new SampleClass1488();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}