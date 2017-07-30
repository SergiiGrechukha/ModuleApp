package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass481 {

    @Ignore    private SampleClass482 sampleClass;

    public SampleClass481(){
        sampleClass = new SampleClass482();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}