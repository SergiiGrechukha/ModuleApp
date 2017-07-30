package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass189 {

    @Ignore    private SampleClass190 sampleClass;

    public SampleClass189(){
        sampleClass = new SampleClass190();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}