package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass316 {

    @Ignore    private SampleClass317 sampleClass;

    public SampleClass316(){
        sampleClass = new SampleClass317();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}