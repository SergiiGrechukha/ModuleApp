package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass327 {

    @Ignore    private SampleClass328 sampleClass;

    public SampleClass327(){
        sampleClass = new SampleClass328();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}