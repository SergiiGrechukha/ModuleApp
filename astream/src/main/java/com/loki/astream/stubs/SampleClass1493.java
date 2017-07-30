package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1493 {

    @Ignore    private SampleClass1494 sampleClass;

    public SampleClass1493(){
        sampleClass = new SampleClass1494();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}