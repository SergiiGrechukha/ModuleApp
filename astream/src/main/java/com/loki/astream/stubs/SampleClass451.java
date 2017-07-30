package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass451 {

    @Ignore    private SampleClass452 sampleClass;

    public SampleClass451(){
        sampleClass = new SampleClass452();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}