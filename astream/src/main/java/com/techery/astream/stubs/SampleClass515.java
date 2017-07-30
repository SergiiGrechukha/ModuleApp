package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass515 {

    @Ignore    private SampleClass516 sampleClass;

    public SampleClass515(){
        sampleClass = new SampleClass516();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}