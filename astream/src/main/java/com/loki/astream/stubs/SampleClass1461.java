package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1461 {

    @Ignore    private SampleClass1462 sampleClass;

    public SampleClass1461(){
        sampleClass = new SampleClass1462();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}