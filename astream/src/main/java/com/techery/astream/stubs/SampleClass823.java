package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass823 {

    @Ignore    private SampleClass824 sampleClass;

    public SampleClass823(){
        sampleClass = new SampleClass824();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}