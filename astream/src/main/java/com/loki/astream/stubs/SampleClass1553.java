package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1553 {

    @Ignore    private SampleClass1554 sampleClass;

    public SampleClass1553(){
        sampleClass = new SampleClass1554();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}