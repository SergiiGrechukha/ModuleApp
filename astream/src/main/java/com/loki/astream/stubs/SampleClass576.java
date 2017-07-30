package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass576 {

    @Ignore    private SampleClass577 sampleClass;

    public SampleClass576(){
        sampleClass = new SampleClass577();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}