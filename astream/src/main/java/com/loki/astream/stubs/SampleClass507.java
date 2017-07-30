package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass507 {

    @Ignore    private SampleClass508 sampleClass;

    public SampleClass507(){
        sampleClass = new SampleClass508();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}