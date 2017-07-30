package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1938 {

    @Ignore    private SampleClass1939 sampleClass;

    public SampleClass1938(){
        sampleClass = new SampleClass1939();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}