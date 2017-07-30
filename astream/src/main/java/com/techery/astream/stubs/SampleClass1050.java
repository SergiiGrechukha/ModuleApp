package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1050 {

    @Ignore    private SampleClass1051 sampleClass;

    public SampleClass1050(){
        sampleClass = new SampleClass1051();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}