package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass577 {

    @Ignore    private SampleClass578 sampleClass;

    public SampleClass577(){
        sampleClass = new SampleClass578();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}