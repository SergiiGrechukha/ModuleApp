package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass431 {

    @Ignore    private SampleClass432 sampleClass;

    public SampleClass431(){
        sampleClass = new SampleClass432();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}