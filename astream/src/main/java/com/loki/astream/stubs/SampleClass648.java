package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass648 {

    @Ignore    private SampleClass649 sampleClass;

    public SampleClass648(){
        sampleClass = new SampleClass649();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}