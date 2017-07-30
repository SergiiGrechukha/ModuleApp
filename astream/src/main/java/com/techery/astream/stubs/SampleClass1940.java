package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1940 {

    @Ignore    private SampleClass1941 sampleClass;

    public SampleClass1940(){
        sampleClass = new SampleClass1941();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}