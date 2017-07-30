package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass415 {

    @Ignore    private SampleClass416 sampleClass;

    public SampleClass415(){
        sampleClass = new SampleClass416();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}