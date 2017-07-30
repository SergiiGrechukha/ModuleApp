package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass510 {

    @Ignore    private SampleClass511 sampleClass;

    public SampleClass510(){
        sampleClass = new SampleClass511();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}