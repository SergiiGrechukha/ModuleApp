package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1952 {

    @Ignore    private SampleClass1953 sampleClass;

    public SampleClass1952(){
        sampleClass = new SampleClass1953();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}