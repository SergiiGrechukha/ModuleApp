package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1400 {

    @Ignore    private SampleClass1401 sampleClass;

    public SampleClass1400(){
        sampleClass = new SampleClass1401();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}