package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1802 {

    @Ignore    private SampleClass1803 sampleClass;

    public SampleClass1802(){
        sampleClass = new SampleClass1803();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}