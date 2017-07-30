package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass337 {

    @Ignore    private SampleClass338 sampleClass;

    public SampleClass337(){
        sampleClass = new SampleClass338();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}