package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass432 {

    @Ignore    private SampleClass433 sampleClass;

    public SampleClass432(){
        sampleClass = new SampleClass433();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}