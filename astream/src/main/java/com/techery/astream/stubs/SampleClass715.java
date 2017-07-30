package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass715 {

    @Ignore    private SampleClass716 sampleClass;

    public SampleClass715(){
        sampleClass = new SampleClass716();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}