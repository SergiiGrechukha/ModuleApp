package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1451 {

    @Ignore    private SampleClass1452 sampleClass;

    public SampleClass1451(){
        sampleClass = new SampleClass1452();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}