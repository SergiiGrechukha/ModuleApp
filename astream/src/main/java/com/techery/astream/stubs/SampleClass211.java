package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass211 {

    @Ignore    private SampleClass212 sampleClass;

    public SampleClass211(){
        sampleClass = new SampleClass212();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}