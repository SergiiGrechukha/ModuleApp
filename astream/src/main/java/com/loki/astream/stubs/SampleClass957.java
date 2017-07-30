package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass957 {

    @Ignore    private SampleClass958 sampleClass;

    public SampleClass957(){
        sampleClass = new SampleClass958();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}