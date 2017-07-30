package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1685 {

    @Ignore    private SampleClass1686 sampleClass;

    public SampleClass1685(){
        sampleClass = new SampleClass1686();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}