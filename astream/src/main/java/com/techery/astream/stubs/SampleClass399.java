package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass399 {

    @Ignore    private SampleClass400 sampleClass;

    public SampleClass399(){
        sampleClass = new SampleClass400();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}