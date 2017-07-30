package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1576 {

    @Ignore    private SampleClass1577 sampleClass;

    public SampleClass1576(){
        sampleClass = new SampleClass1577();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}