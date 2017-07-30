package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1703 {

    @Ignore    private SampleClass1704 sampleClass;

    public SampleClass1703(){
        sampleClass = new SampleClass1704();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}