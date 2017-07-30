package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1879 {

    @Ignore    private SampleClass1880 sampleClass;

    public SampleClass1879(){
        sampleClass = new SampleClass1880();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}