package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass493 {

    @Ignore    private SampleClass494 sampleClass;

    public SampleClass493(){
        sampleClass = new SampleClass494();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}