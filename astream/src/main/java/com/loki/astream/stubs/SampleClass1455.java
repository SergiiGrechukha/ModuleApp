package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1455 {

    @Ignore    private SampleClass1456 sampleClass;

    public SampleClass1455(){
        sampleClass = new SampleClass1456();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}