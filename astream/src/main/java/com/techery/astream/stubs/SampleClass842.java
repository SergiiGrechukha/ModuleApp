package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass842 {

    @Ignore    private SampleClass843 sampleClass;

    public SampleClass842(){
        sampleClass = new SampleClass843();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}