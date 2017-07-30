package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass436 {

    @Ignore    private SampleClass437 sampleClass;

    public SampleClass436(){
        sampleClass = new SampleClass437();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}