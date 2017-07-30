package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1018 {

    @Ignore    private SampleClass1019 sampleClass;

    public SampleClass1018(){
        sampleClass = new SampleClass1019();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}