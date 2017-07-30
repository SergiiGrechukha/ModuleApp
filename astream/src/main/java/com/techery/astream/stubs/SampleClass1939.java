package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1939 {

    @Ignore    private SampleClass1940 sampleClass;

    public SampleClass1939(){
        sampleClass = new SampleClass1940();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}