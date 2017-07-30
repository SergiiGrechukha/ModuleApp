package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1363 {

    @Ignore    private SampleClass1364 sampleClass;

    public SampleClass1363(){
        sampleClass = new SampleClass1364();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}