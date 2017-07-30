package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1465 {

    @Ignore    private SampleClass1466 sampleClass;

    public SampleClass1465(){
        sampleClass = new SampleClass1466();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}