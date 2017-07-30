package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass90 {

    @Ignore    private SampleClass91 sampleClass;

    public SampleClass90(){
        sampleClass = new SampleClass91();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}