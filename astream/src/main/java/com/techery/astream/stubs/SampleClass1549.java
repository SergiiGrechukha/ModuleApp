package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1549 {

    @Ignore    private SampleClass1550 sampleClass;

    public SampleClass1549(){
        sampleClass = new SampleClass1550();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}