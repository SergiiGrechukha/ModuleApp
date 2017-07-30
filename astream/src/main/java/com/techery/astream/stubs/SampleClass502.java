package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass502 {

    @Ignore    private SampleClass503 sampleClass;

    public SampleClass502(){
        sampleClass = new SampleClass503();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}