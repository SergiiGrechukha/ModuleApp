package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1398 {

    @Ignore    private SampleClass1399 sampleClass;

    public SampleClass1398(){
        sampleClass = new SampleClass1399();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}