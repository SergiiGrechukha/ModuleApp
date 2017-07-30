package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass685 {

    @Ignore    private SampleClass686 sampleClass;

    public SampleClass685(){
        sampleClass = new SampleClass686();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}