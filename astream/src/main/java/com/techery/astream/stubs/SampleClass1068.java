package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1068 {

    @Ignore    private SampleClass1069 sampleClass;

    public SampleClass1068(){
        sampleClass = new SampleClass1069();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}