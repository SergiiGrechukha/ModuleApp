package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass138 {

    @Ignore    private SampleClass139 sampleClass;

    public SampleClass138(){
        sampleClass = new SampleClass139();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}