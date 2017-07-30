package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1922 {

    @Ignore    private SampleClass1923 sampleClass;

    public SampleClass1922(){
        sampleClass = new SampleClass1923();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}