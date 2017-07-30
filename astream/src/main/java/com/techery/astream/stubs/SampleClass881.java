package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass881 {

    @Ignore    private SampleClass882 sampleClass;

    public SampleClass881(){
        sampleClass = new SampleClass882();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}