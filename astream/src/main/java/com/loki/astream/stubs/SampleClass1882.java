package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1882 {

    @Ignore    private SampleClass1883 sampleClass;

    public SampleClass1882(){
        sampleClass = new SampleClass1883();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}