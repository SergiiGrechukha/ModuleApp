package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1335 {

    @Ignore    private SampleClass1336 sampleClass;

    public SampleClass1335(){
        sampleClass = new SampleClass1336();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}