package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1964 {

    @Ignore    private SampleClass1965 sampleClass;

    public SampleClass1964(){
        sampleClass = new SampleClass1965();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}