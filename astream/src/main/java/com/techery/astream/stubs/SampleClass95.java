package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass95 {

    @Ignore    private SampleClass96 sampleClass;

    public SampleClass95(){
        sampleClass = new SampleClass96();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}