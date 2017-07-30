package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1754 {

    @Ignore    private SampleClass1755 sampleClass;

    public SampleClass1754(){
        sampleClass = new SampleClass1755();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}