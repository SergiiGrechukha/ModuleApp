package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1124 {

    @Ignore    private SampleClass1125 sampleClass;

    public SampleClass1124(){
        sampleClass = new SampleClass1125();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}