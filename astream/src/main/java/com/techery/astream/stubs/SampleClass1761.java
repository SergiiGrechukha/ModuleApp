package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1761 {

    @Ignore    private SampleClass1762 sampleClass;

    public SampleClass1761(){
        sampleClass = new SampleClass1762();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}