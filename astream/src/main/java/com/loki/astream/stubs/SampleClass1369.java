package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1369 {

    @Ignore    private SampleClass1370 sampleClass;

    public SampleClass1369(){
        sampleClass = new SampleClass1370();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}