package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1073 {

    @Ignore    private SampleClass1074 sampleClass;

    public SampleClass1073(){
        sampleClass = new SampleClass1074();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}