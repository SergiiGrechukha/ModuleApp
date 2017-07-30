package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1129 {

    @Ignore    private SampleClass1130 sampleClass;

    public SampleClass1129(){
        sampleClass = new SampleClass1130();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}