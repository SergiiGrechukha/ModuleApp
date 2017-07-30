package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1297 {

    @Ignore    private SampleClass1298 sampleClass;

    public SampleClass1297(){
        sampleClass = new SampleClass1298();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}