package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass164 {

    @Ignore    private SampleClass165 sampleClass;

    public SampleClass164(){
        sampleClass = new SampleClass165();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}