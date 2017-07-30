package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1227 {

    @Ignore    private SampleClass1228 sampleClass;

    public SampleClass1227(){
        sampleClass = new SampleClass1228();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}