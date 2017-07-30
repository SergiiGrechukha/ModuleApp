package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1399 {

    @Ignore    private SampleClass1400 sampleClass;

    public SampleClass1399(){
        sampleClass = new SampleClass1400();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}