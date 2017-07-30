package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass741 {

    @Ignore    private SampleClass742 sampleClass;

    public SampleClass741(){
        sampleClass = new SampleClass742();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}