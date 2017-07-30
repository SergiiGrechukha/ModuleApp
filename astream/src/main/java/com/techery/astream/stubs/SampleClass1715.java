package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1715 {

    @Ignore    private SampleClass1716 sampleClass;

    public SampleClass1715(){
        sampleClass = new SampleClass1716();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}