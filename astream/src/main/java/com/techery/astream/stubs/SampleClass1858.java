package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1858 {

    @Ignore    private SampleClass1859 sampleClass;

    public SampleClass1858(){
        sampleClass = new SampleClass1859();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}