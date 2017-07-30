package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass409 {

    @Ignore    private SampleClass410 sampleClass;

    public SampleClass409(){
        sampleClass = new SampleClass410();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}