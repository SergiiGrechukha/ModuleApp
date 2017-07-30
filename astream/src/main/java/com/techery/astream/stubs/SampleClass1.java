package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1 {

    @Ignore    private SampleClass2 sampleClass;

    public SampleClass1(){
        sampleClass = new SampleClass2();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}