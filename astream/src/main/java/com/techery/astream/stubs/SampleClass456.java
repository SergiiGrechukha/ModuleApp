package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass456 {

    @Ignore    private SampleClass457 sampleClass;

    public SampleClass456(){
        sampleClass = new SampleClass457();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}