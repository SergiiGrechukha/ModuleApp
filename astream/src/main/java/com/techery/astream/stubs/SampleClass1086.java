package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1086 {

    @Ignore    private SampleClass1087 sampleClass;

    public SampleClass1086(){
        sampleClass = new SampleClass1087();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}