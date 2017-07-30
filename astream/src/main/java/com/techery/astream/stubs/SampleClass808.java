package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass808 {

    @Ignore    private SampleClass809 sampleClass;

    public SampleClass808(){
        sampleClass = new SampleClass809();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}