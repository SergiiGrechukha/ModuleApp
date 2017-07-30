package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1329 {

    @Ignore    private SampleClass1330 sampleClass;

    public SampleClass1329(){
        sampleClass = new SampleClass1330();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}