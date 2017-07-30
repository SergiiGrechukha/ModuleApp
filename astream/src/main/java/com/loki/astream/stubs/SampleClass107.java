package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass107 {

    @Ignore    private SampleClass108 sampleClass;

    public SampleClass107(){
        sampleClass = new SampleClass108();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}