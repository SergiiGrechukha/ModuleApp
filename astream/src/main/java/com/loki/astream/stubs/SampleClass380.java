package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass380 {

    @Ignore    private SampleClass381 sampleClass;

    public SampleClass380(){
        sampleClass = new SampleClass381();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}