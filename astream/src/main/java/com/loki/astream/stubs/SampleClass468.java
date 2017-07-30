package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass468 {

    @Ignore    private SampleClass469 sampleClass;

    public SampleClass468(){
        sampleClass = new SampleClass469();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}