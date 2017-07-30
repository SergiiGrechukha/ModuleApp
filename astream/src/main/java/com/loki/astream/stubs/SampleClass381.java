package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass381 {

    @Ignore    private SampleClass382 sampleClass;

    public SampleClass381(){
        sampleClass = new SampleClass382();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}