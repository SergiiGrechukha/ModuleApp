package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass655 {

    @Ignore    private SampleClass656 sampleClass;

    public SampleClass655(){
        sampleClass = new SampleClass656();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}