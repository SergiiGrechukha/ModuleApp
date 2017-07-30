package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass471 {

    @Ignore    private SampleClass472 sampleClass;

    public SampleClass471(){
        sampleClass = new SampleClass472();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}