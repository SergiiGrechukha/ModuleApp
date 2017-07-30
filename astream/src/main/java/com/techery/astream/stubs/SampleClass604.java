package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass604 {

    @Ignore    private SampleClass605 sampleClass;

    public SampleClass604(){
        sampleClass = new SampleClass605();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}