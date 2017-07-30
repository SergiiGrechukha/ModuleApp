package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1921 {

    @Ignore    private SampleClass1922 sampleClass;

    public SampleClass1921(){
        sampleClass = new SampleClass1922();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}