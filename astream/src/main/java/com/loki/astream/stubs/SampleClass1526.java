package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1526 {

    @Ignore    private SampleClass1527 sampleClass;

    public SampleClass1526(){
        sampleClass = new SampleClass1527();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}