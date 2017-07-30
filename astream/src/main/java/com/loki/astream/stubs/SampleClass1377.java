package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1377 {

    @Ignore    private SampleClass1378 sampleClass;

    public SampleClass1377(){
        sampleClass = new SampleClass1378();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}