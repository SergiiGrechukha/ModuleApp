package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass203 {

    @Ignore    private SampleClass204 sampleClass;

    public SampleClass203(){
        sampleClass = new SampleClass204();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}