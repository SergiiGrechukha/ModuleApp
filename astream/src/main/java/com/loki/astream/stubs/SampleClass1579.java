package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1579 {

    @Ignore    private SampleClass1580 sampleClass;

    public SampleClass1579(){
        sampleClass = new SampleClass1580();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}