package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1069 {

    @Ignore    private SampleClass1070 sampleClass;

    public SampleClass1069(){
        sampleClass = new SampleClass1070();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}