package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass516 {

    @Ignore    private SampleClass517 sampleClass;

    public SampleClass516(){
        sampleClass = new SampleClass517();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}