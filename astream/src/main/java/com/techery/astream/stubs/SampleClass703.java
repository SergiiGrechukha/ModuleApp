package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass703 {

    @Ignore    private SampleClass704 sampleClass;

    public SampleClass703(){
        sampleClass = new SampleClass704();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}