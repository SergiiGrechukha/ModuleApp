package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass367 {

    @Ignore    private SampleClass368 sampleClass;

    public SampleClass367(){
        sampleClass = new SampleClass368();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}