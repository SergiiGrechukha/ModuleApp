package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass487 {

    @Ignore    private SampleClass488 sampleClass;

    public SampleClass487(){
        sampleClass = new SampleClass488();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}