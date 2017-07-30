package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1415 {

    @Ignore    private SampleClass1416 sampleClass;

    public SampleClass1415(){
        sampleClass = new SampleClass1416();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}