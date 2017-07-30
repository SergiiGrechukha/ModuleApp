package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass0 {

    @Ignore    private SampleClass1 sampleClass;

    public SampleClass0(){
        sampleClass = new SampleClass1();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}