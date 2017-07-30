package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass564 {

    @Ignore    private SampleClass565 sampleClass;

    public SampleClass564(){
        sampleClass = new SampleClass565();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}