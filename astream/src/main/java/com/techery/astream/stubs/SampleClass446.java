package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass446 {

    @Ignore    private SampleClass447 sampleClass;

    public SampleClass446(){
        sampleClass = new SampleClass447();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}