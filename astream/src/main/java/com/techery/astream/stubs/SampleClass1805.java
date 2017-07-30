package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1805 {

    @Ignore    private SampleClass1806 sampleClass;

    public SampleClass1805(){
        sampleClass = new SampleClass1806();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}