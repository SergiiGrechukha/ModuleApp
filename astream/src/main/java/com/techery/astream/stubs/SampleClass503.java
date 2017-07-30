package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass503 {

    @Ignore    private SampleClass504 sampleClass;

    public SampleClass503(){
        sampleClass = new SampleClass504();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}