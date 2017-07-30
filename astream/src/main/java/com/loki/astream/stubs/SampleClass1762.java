package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1762 {

    @Ignore    private SampleClass1763 sampleClass;

    public SampleClass1762(){
        sampleClass = new SampleClass1763();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}