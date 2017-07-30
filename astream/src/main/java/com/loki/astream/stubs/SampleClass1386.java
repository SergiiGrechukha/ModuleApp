package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1386 {

    @Ignore    private SampleClass1387 sampleClass;

    public SampleClass1386(){
        sampleClass = new SampleClass1387();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}