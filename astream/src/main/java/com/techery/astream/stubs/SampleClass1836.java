package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1836 {

    @Ignore    private SampleClass1837 sampleClass;

    public SampleClass1836(){
        sampleClass = new SampleClass1837();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}