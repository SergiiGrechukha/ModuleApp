package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1503 {

    @Ignore    private SampleClass1504 sampleClass;

    public SampleClass1503(){
        sampleClass = new SampleClass1504();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}