package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1011 {

    @Ignore    private SampleClass1012 sampleClass;

    public SampleClass1011(){
        sampleClass = new SampleClass1012();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}