package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1905 {

    @Ignore    private SampleClass1906 sampleClass;

    public SampleClass1905(){
        sampleClass = new SampleClass1906();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}