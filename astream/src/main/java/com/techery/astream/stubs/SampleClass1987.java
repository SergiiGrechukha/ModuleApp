package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1987 {

    @Ignore    private SampleClass1988 sampleClass;

    public SampleClass1987(){
        sampleClass = new SampleClass1988();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}