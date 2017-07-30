package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1248 {

    @Ignore    private SampleClass1249 sampleClass;

    public SampleClass1248(){
        sampleClass = new SampleClass1249();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}