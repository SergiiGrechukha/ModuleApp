package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass455 {

    @Ignore    private SampleClass456 sampleClass;

    public SampleClass455(){
        sampleClass = new SampleClass456();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}