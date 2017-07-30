package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass182 {

    @Ignore    private SampleClass183 sampleClass;

    public SampleClass182(){
        sampleClass = new SampleClass183();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}