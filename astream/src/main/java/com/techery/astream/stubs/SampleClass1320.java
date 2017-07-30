package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1320 {

    @Ignore    private SampleClass1321 sampleClass;

    public SampleClass1320(){
        sampleClass = new SampleClass1321();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}