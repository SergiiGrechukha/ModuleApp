package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass781 {

    @Ignore    private SampleClass782 sampleClass;

    public SampleClass781(){
        sampleClass = new SampleClass782();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}