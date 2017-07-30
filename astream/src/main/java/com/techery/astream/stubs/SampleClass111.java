package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass111 {

    @Ignore    private SampleClass112 sampleClass;

    public SampleClass111(){
        sampleClass = new SampleClass112();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}