package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass426 {

    @Ignore    private SampleClass427 sampleClass;

    public SampleClass426(){
        sampleClass = new SampleClass427();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}