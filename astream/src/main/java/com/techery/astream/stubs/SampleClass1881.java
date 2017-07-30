package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1881 {

    @Ignore    private SampleClass1882 sampleClass;

    public SampleClass1881(){
        sampleClass = new SampleClass1882();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}