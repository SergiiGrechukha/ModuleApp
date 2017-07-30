package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass133 {

    @Ignore    private SampleClass134 sampleClass;

    public SampleClass133(){
        sampleClass = new SampleClass134();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}