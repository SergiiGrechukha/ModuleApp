package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1688 {

    @Ignore    private SampleClass1689 sampleClass;

    public SampleClass1688(){
        sampleClass = new SampleClass1689();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}