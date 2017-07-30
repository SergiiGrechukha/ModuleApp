package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1494 {

    @Ignore    private SampleClass1495 sampleClass;

    public SampleClass1494(){
        sampleClass = new SampleClass1495();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}