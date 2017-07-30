package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1958 {

    @Ignore    private SampleClass1959 sampleClass;

    public SampleClass1958(){
        sampleClass = new SampleClass1959();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}