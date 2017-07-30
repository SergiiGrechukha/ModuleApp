package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass981 {

    @Ignore    private SampleClass982 sampleClass;

    public SampleClass981(){
        sampleClass = new SampleClass982();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}