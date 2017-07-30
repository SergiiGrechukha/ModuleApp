package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass40 {

    @Ignore    private SampleClass41 sampleClass;

    public SampleClass40(){
        sampleClass = new SampleClass41();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}