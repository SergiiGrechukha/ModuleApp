package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1024 {

    @Ignore    private SampleClass1025 sampleClass;

    public SampleClass1024(){
        sampleClass = new SampleClass1025();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}