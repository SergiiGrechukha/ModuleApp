package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass55 {

    @Ignore    private SampleClass56 sampleClass;

    public SampleClass55(){
        sampleClass = new SampleClass56();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}