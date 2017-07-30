package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1425 {

    @Ignore    private SampleClass1426 sampleClass;

    public SampleClass1425(){
        sampleClass = new SampleClass1426();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}