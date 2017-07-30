package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass688 {

    @Ignore    private SampleClass689 sampleClass;

    public SampleClass688(){
        sampleClass = new SampleClass689();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}