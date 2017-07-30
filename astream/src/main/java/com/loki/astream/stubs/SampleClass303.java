package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass303 {

    @Ignore    private SampleClass304 sampleClass;

    public SampleClass303(){
        sampleClass = new SampleClass304();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}