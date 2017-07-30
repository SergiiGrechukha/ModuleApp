package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass948 {

    @Ignore    private SampleClass949 sampleClass;

    public SampleClass948(){
        sampleClass = new SampleClass949();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}