package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1589 {

    @Ignore    private SampleClass1590 sampleClass;

    public SampleClass1589(){
        sampleClass = new SampleClass1590();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}