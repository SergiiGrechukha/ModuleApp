package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass597 {

    @Ignore    private SampleClass598 sampleClass;

    public SampleClass597(){
        sampleClass = new SampleClass598();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}