package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1182 {

    @Ignore    private SampleClass1183 sampleClass;

    public SampleClass1182(){
        sampleClass = new SampleClass1183();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}