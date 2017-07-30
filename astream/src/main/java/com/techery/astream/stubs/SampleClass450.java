package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass450 {

    @Ignore    private SampleClass451 sampleClass;

    public SampleClass450(){
        sampleClass = new SampleClass451();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}