package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1185 {

    @Ignore    private SampleClass1186 sampleClass;

    public SampleClass1185(){
        sampleClass = new SampleClass1186();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}