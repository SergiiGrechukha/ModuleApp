package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1347 {

    @Ignore    private SampleClass1348 sampleClass;

    public SampleClass1347(){
        sampleClass = new SampleClass1348();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}