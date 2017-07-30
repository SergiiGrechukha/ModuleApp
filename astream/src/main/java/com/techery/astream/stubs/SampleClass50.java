package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass50 {

    @Ignore    private SampleClass51 sampleClass;

    public SampleClass50(){
        sampleClass = new SampleClass51();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}