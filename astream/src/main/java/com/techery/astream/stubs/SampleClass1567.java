package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1567 {

    @Ignore    private SampleClass1568 sampleClass;

    public SampleClass1567(){
        sampleClass = new SampleClass1568();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}