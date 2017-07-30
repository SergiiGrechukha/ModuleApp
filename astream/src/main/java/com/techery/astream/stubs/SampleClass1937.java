package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1937 {

    @Ignore    private SampleClass1938 sampleClass;

    public SampleClass1937(){
        sampleClass = new SampleClass1938();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}