package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass602 {

    @Ignore    private SampleClass603 sampleClass;

    public SampleClass602(){
        sampleClass = new SampleClass603();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}