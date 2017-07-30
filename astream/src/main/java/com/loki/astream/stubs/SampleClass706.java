package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass706 {

    @Ignore    private SampleClass707 sampleClass;

    public SampleClass706(){
        sampleClass = new SampleClass707();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}