package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1672 {

    @Ignore    private SampleClass1673 sampleClass;

    public SampleClass1672(){
        sampleClass = new SampleClass1673();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}