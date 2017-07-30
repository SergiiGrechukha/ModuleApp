package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1560 {

    @Ignore    private SampleClass1561 sampleClass;

    public SampleClass1560(){
        sampleClass = new SampleClass1561();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}