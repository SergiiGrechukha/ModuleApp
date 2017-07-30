package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1933 {

    @Ignore    private SampleClass1934 sampleClass;

    public SampleClass1933(){
        sampleClass = new SampleClass1934();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}