package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass837 {

    @Ignore    private SampleClass838 sampleClass;

    public SampleClass837(){
        sampleClass = new SampleClass838();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}