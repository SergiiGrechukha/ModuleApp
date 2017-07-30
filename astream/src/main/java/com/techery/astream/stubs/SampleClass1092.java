package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1092 {

    @Ignore    private SampleClass1093 sampleClass;

    public SampleClass1092(){
        sampleClass = new SampleClass1093();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}