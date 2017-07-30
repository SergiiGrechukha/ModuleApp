package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass145 {

    @Ignore    private SampleClass146 sampleClass;

    public SampleClass145(){
        sampleClass = new SampleClass146();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}