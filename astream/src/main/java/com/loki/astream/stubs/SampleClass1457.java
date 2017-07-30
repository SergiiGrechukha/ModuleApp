package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1457 {

    @Ignore    private SampleClass1458 sampleClass;

    public SampleClass1457(){
        sampleClass = new SampleClass1458();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}