package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1623 {

    @Ignore    private SampleClass1624 sampleClass;

    public SampleClass1623(){
        sampleClass = new SampleClass1624();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}