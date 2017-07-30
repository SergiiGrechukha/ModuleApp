package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1133 {

    @Ignore    private SampleClass1134 sampleClass;

    public SampleClass1133(){
        sampleClass = new SampleClass1134();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}