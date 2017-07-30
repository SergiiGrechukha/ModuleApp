package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass56 {

    @Ignore    private SampleClass57 sampleClass;

    public SampleClass56(){
        sampleClass = new SampleClass57();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}