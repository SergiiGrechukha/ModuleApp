package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass19 {

    @Ignore    private SampleClass20 sampleClass;

    public SampleClass19(){
        sampleClass = new SampleClass20();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}