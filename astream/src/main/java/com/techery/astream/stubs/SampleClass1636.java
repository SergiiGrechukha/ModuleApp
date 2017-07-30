package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1636 {

    @Ignore    private SampleClass1637 sampleClass;

    public SampleClass1636(){
        sampleClass = new SampleClass1637();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}