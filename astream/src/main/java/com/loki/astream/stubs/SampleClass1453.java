package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1453 {

    @Ignore    private SampleClass1454 sampleClass;

    public SampleClass1453(){
        sampleClass = new SampleClass1454();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}