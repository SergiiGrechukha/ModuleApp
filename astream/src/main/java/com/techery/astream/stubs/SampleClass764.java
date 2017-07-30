package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass764 {

    @Ignore    private SampleClass765 sampleClass;

    public SampleClass764(){
        sampleClass = new SampleClass765();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}