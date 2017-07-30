package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass4 {

    @Ignore    private SampleClass5 sampleClass;

    public SampleClass4(){
        sampleClass = new SampleClass5();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}