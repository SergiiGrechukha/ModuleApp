package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass779 {

    @Ignore    private SampleClass780 sampleClass;

    public SampleClass779(){
        sampleClass = new SampleClass780();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}