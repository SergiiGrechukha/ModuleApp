package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass937 {

    @Ignore    private SampleClass938 sampleClass;

    public SampleClass937(){
        sampleClass = new SampleClass938();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}