package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass252 {

    @Ignore    private SampleClass253 sampleClass;

    public SampleClass252(){
        sampleClass = new SampleClass253();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}