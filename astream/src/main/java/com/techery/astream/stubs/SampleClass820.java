package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass820 {

    @Ignore    private SampleClass821 sampleClass;

    public SampleClass820(){
        sampleClass = new SampleClass821();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}