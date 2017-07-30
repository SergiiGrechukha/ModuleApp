package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1094 {

    @Ignore    private SampleClass1095 sampleClass;

    public SampleClass1094(){
        sampleClass = new SampleClass1095();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}