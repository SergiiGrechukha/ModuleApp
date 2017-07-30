package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1920 {

    @Ignore    private SampleClass1921 sampleClass;

    public SampleClass1920(){
        sampleClass = new SampleClass1921();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}