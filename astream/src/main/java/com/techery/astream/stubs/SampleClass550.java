package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass550 {

    @Ignore    private SampleClass551 sampleClass;

    public SampleClass550(){
        sampleClass = new SampleClass551();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}