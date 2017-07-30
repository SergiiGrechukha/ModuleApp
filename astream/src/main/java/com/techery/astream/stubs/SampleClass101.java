package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass101 {

    @Ignore    private SampleClass102 sampleClass;

    public SampleClass101(){
        sampleClass = new SampleClass102();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}