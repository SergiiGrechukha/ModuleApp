package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1624 {

    @Ignore    private SampleClass1625 sampleClass;

    public SampleClass1624(){
        sampleClass = new SampleClass1625();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}