package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1699 {

    @Ignore    private SampleClass1700 sampleClass;

    public SampleClass1699(){
        sampleClass = new SampleClass1700();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}