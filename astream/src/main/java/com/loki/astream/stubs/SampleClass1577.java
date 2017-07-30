package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1577 {

    @Ignore    private SampleClass1578 sampleClass;

    public SampleClass1577(){
        sampleClass = new SampleClass1578();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}