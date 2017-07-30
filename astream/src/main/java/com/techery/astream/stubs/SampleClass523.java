package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass523 {

    @Ignore    private SampleClass524 sampleClass;

    public SampleClass523(){
        sampleClass = new SampleClass524();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}