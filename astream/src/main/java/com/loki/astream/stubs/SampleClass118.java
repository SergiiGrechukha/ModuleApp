package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass118 {

    @Ignore    private SampleClass119 sampleClass;

    public SampleClass118(){
        sampleClass = new SampleClass119();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}