package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1963 {

    @Ignore    private SampleClass1964 sampleClass;

    public SampleClass1963(){
        sampleClass = new SampleClass1964();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}