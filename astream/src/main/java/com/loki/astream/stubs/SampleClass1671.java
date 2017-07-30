package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1671 {

    @Ignore    private SampleClass1672 sampleClass;

    public SampleClass1671(){
        sampleClass = new SampleClass1672();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}