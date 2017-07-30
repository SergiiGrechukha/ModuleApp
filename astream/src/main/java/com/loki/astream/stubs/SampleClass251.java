package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass251 {

    @Ignore    private SampleClass252 sampleClass;

    public SampleClass251(){
        sampleClass = new SampleClass252();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}