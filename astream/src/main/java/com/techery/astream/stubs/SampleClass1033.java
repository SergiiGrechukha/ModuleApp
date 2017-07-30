package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1033 {

    @Ignore    private SampleClass1034 sampleClass;

    public SampleClass1033(){
        sampleClass = new SampleClass1034();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}