package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1991 {

    @Ignore    private SampleClass1992 sampleClass;

    public SampleClass1991(){
        sampleClass = new SampleClass1992();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}