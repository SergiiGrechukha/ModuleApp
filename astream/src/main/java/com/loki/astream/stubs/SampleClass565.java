package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass565 {

    @Ignore    private SampleClass566 sampleClass;

    public SampleClass565(){
        sampleClass = new SampleClass566();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}