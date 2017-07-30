package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1213 {

    @Ignore    private SampleClass1214 sampleClass;

    public SampleClass1213(){
        sampleClass = new SampleClass1214();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}