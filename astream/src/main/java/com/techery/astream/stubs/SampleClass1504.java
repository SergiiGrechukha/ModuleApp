package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1504 {

    @Ignore    private SampleClass1505 sampleClass;

    public SampleClass1504(){
        sampleClass = new SampleClass1505();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}