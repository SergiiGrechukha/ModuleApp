package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1405 {

    @Ignore    private SampleClass1406 sampleClass;

    public SampleClass1405(){
        sampleClass = new SampleClass1406();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}