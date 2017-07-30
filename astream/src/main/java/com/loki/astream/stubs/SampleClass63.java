package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass63 {

    @Ignore    private SampleClass64 sampleClass;

    public SampleClass63(){
        sampleClass = new SampleClass64();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}