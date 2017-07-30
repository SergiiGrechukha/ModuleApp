package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1948 {

    @Ignore    private SampleClass1949 sampleClass;

    public SampleClass1948(){
        sampleClass = new SampleClass1949();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}