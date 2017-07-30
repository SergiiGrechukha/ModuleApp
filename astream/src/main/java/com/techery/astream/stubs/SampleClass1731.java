package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1731 {

    @Ignore    private SampleClass1732 sampleClass;

    public SampleClass1731(){
        sampleClass = new SampleClass1732();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}