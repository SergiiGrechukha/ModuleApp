package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1917 {

    @Ignore    private SampleClass1918 sampleClass;

    public SampleClass1917(){
        sampleClass = new SampleClass1918();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}