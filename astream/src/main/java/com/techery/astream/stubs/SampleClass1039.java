package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1039 {

    @Ignore    private SampleClass1040 sampleClass;

    public SampleClass1039(){
        sampleClass = new SampleClass1040();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}