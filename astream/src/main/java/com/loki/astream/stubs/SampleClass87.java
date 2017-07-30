package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass87 {

    @Ignore    private SampleClass88 sampleClass;

    public SampleClass87(){
        sampleClass = new SampleClass88();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}