package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass895 {

    @Ignore    private SampleClass896 sampleClass;

    public SampleClass895(){
        sampleClass = new SampleClass896();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}