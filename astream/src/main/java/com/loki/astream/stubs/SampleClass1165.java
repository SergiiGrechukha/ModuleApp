package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1165 {

    @Ignore    private SampleClass1166 sampleClass;

    public SampleClass1165(){
        sampleClass = new SampleClass1166();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}