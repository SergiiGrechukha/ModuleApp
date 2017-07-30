package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1464 {

    @Ignore    private SampleClass1465 sampleClass;

    public SampleClass1464(){
        sampleClass = new SampleClass1465();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}