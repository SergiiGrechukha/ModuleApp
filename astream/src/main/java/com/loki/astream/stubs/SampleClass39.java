package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass39 {

    @Ignore    private SampleClass40 sampleClass;

    public SampleClass39(){
        sampleClass = new SampleClass40();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}