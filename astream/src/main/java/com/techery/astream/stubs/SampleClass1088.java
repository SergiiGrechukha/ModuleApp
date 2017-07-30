package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1088 {

    @Ignore    private SampleClass1089 sampleClass;

    public SampleClass1088(){
        sampleClass = new SampleClass1089();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}