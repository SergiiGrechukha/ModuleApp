package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass232 {

    @Ignore    private SampleClass233 sampleClass;

    public SampleClass232(){
        sampleClass = new SampleClass233();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}