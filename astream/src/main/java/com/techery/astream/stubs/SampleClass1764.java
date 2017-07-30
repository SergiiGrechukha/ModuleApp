package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1764 {

    @Ignore    private SampleClass1765 sampleClass;

    public SampleClass1764(){
        sampleClass = new SampleClass1765();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}