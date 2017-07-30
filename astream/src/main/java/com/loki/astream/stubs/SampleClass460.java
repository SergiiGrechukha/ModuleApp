package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass460 {

    @Ignore    private SampleClass461 sampleClass;

    public SampleClass460(){
        sampleClass = new SampleClass461();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}