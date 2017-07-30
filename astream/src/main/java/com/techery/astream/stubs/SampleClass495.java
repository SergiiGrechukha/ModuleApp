package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass495 {

    @Ignore    private SampleClass496 sampleClass;

    public SampleClass495(){
        sampleClass = new SampleClass496();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}