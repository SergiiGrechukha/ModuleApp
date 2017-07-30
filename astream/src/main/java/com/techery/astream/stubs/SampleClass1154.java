package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1154 {

    @Ignore    private SampleClass1155 sampleClass;

    public SampleClass1154(){
        sampleClass = new SampleClass1155();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}