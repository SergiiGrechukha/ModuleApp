package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass958 {

    @Ignore    private SampleClass959 sampleClass;

    public SampleClass958(){
        sampleClass = new SampleClass959();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}