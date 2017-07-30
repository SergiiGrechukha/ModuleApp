package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass740 {

    @Ignore    private SampleClass741 sampleClass;

    public SampleClass740(){
        sampleClass = new SampleClass741();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}