package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1467 {

    @Ignore    private SampleClass1468 sampleClass;

    public SampleClass1467(){
        sampleClass = new SampleClass1468();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}