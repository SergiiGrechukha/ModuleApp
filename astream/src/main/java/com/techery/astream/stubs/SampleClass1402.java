package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1402 {

    @Ignore    private SampleClass1403 sampleClass;

    public SampleClass1402(){
        sampleClass = new SampleClass1403();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}