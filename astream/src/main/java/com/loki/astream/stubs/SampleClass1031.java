package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1031 {

    @Ignore    private SampleClass1032 sampleClass;

    public SampleClass1031(){
        sampleClass = new SampleClass1032();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}