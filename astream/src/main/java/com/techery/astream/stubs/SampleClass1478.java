package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1478 {

    @Ignore    private SampleClass1479 sampleClass;

    public SampleClass1478(){
        sampleClass = new SampleClass1479();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}