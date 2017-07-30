package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1931 {

    @Ignore    private SampleClass1932 sampleClass;

    public SampleClass1931(){
        sampleClass = new SampleClass1932();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}