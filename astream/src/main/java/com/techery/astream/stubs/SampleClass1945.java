package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1945 {

    @Ignore    private SampleClass1946 sampleClass;

    public SampleClass1945(){
        sampleClass = new SampleClass1946();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}