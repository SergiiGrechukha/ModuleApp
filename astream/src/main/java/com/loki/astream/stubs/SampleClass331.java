package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass331 {

    @Ignore    private SampleClass332 sampleClass;

    public SampleClass331(){
        sampleClass = new SampleClass332();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}