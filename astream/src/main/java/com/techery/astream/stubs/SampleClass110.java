package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass110 {

    @Ignore    private SampleClass111 sampleClass;

    public SampleClass110(){
        sampleClass = new SampleClass111();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}