package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1221 {

    @Ignore    private SampleClass1222 sampleClass;

    public SampleClass1221(){
        sampleClass = new SampleClass1222();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}